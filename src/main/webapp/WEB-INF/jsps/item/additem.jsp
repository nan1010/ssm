<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="script.jsp"></script>
</head>
<body>
<form id="insertitem" enctype="multipart/form-data">  
	<table align="center">
		<tr>
			<td>
				<label for="exampleInputName2">商品名称</label>
			</td>
			<td>
    			<input name="itemname" type="text" class="form-control" id="exampleInputName2" placeholder="商品名称">
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">商品简介</label>
			</td>
			<td>
    			<textarea name="itemdesc" id="itemdesc" class="form-control" placeholder="商品简介" rows="3"></textarea>
			</td>
		</tr>
		<tr>
			<td>
				<label for="exampleInputName2">商品金额</label>
			</td>
			<td>
    			<input type="text" name="itemprice" class="form-control" id="itemprice" placeholder="商品金额">
			</td>
		</tr>
		
		<tr>
			<td>
				<div style="float:left"><input class="img-btn" type="file" id="files" name="files"></div>
			</td>
			<td>
				<div style="float:left" class="img-container"></div>
			</td>
		</tr>
	</table>
<div class="btn_boxB floatR mag_l20"><input name="" type="button" value="取消" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
<div class="btn_box floatR"><input id="inseritem" name="" type="button" value="提交" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
</form>

</body>
</html>

