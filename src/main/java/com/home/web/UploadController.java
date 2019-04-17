package com.home.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.home.domain.Item;
import com.home.service.impl.ItemServiceImpl;
import com.home.utils.Commons;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@RequestMapping("/upload")
public class UploadController{
	@Autowired
	@Qualifier("itemServiceImpl")
	ItemServiceImpl itemServiceImpl;
	
	//转到aditem页面
	@RequestMapping("/toadd")
	public String toAdd() {
		return "item/additem";
	}
	
	//转到upload页面
	@RequestMapping("/toupload")
	public String toUpload() {
		return "item/edititem";
	}	
	
	@RequestMapping("/uploadpic")
	//可以使用PrintWriter类将路径返回给页面的回调函数，所以这里的方法可以是void
	public void uploadPic(HttpServletRequest request, @RequestParam("imgSize1File") MultipartFile multipartFile, PrintWriter out) throws IllegalStateException, IOException {

	//文件的名称在服务器有可能重复,所以使用以下数据结构来命名图片
	String newFileName = "";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMDDHHmmssSSS");
	newFileName = sdf.format(new Date());
	
	Random r = new Random();
	
	for(int i = 0; i<3; i++) {
		newFileName += r.nextInt(10);
	}
	
	//获取文件扩展名
	String originalFileName = multipartFile.getOriginalFilename();
	String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
	
	byte[] fbytes = multipartFile.getBytes();
	//创建jersy服务器，进行跨服上传
	Client client = Client.create();
	//把文件关联到远程服务器
	WebResource resource = client.resource(Commons.PIC_HOST + "/upload/" + newFileName + suffix);
	//上传
	resource.put(String.class, fbytes);
	
	//图片需要回显，需要服务器图片全路径
	//数据库要保存数据，需要相对路径
	String fullPath = Commons.PIC_HOST + "/upload/" + newFileName + suffix;
	String relativePath = "/upload/" + newFileName + suffix;
	
	//用带有json格式的String传回，{"":"", "":""}
	String result = "{\"fullPath\":\"" + fullPath + "\", \"relativePath\":\"" + relativePath + "\"}";
	
	out.print(result);
	}

	@RequestMapping(value = "/uploadpic2")
	
	    public String updateThumb(@RequestParam("name") String name,
	            @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
	        if (!file.isEmpty()) { file.transferTo(new File("/images/"+ name + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."))));
	            return "redirect:item/success.jsp";}
	         else {
	            return "redirect:item/fail.jsp";
	        }
	    }
	

	
	
}

