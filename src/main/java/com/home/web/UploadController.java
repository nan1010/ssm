package com.home.web;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.home.domain.Item;

@RequestMapping("/upload")
public class UploadController{
	//传入Item  ItemServiceImpl 对象
	
	
	//转到upload页面
	@RequestMapping("/toupload")
	public String toUpload() {
		return "item/edititem";
	}
	@RequestMapping("/uploadpic")
	//可以使用PrintWriter类将路径返回给页面的回调函数，所以这里的方法可以是void
	public void uploadPic(HttpServletRequest request, String fileName, PrintWriter out) throws IllegalStateException, IOException {
	//由于request是流类型，需要将其强转成多部件请求对象
	MultipartHttpServletRequest mh = (MultipartHttpServletRequest) request;
	//根据文件名称获取文件对象
	CommonsMultipartFile cm = (CommonsMultipartFile)mh.getFile(fileName);
	//获取文件上传流
	byte[] fbytes = cm.getBytes();
	
	//文件的名称在服务器有可能重复,所以使用以下数据结构来命名图片
	String newFileName = "";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMDDHHmmssSSS");
	newFileName = sdf.format(new Date());
	
	Random r = new Random();
	
	for(int i = 0; i<3; i++) {
		newFileName += r.nextInt(10);
	}
	
	//获取文件扩展名
	String originalFileName = cm.getOriginalFilename();
	String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
	
	//得到最终的newFileName
	newFileName += suffix;
	
	//服务器中存储图片的路径  
	String picPath = "${pageContext.request.contextPath}/images";
	File newFile = new File(picPath + "/" + newFileName);
	//将内存中的图片写进磁盘中
	cm.transferTo(newFile);
	
	//图片需要回显，需要服务器图片全路径
	//数据库要保存数据，需要相对路径
	String fullPath = "${pageContext.request.contextPath}/images/" + newFileName;
	String relativePath = "images/" + newFileName;
	
	//用带有json格式的String传回，{"":"", "":""}
	String result = "{\"fullPath\":\"" + fullPath + "\", \"relativePath\":\"" + relativePath + "\"}";
	
	out.print(result);
	}
	
	
}

