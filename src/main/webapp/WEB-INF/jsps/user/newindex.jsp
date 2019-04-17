<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="picPath" value="http://localhost:8003/ssmimage/upload/"></c:set>
<!DOCTYPE html>
<html>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>公司网站</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        *.h:hover {
            background-color: #328CC1
        }

        * {
            line-height: 200%
        }

        body {
            padding-top: 70px;
            background-color: azure
        }

        .bg-bule {
            background-color: rgb(91, 197, 247)
        }

        a {
            display: block;
            text-decoration: none;
            padding: .7em 1em;
            color: #000000;
            /* background-color: #f9f9f9 */
        }

        a:hover {
            background-color: #328CC1;
            color: #f9f9f9;
            -webkit-transition: color .3s linear
        }

        nav a {
            color: white
        }
    </style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <nav id="nav" class="navbar navbar-default navbar-fixed-top bg-bule">
        <div class="container">

            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Brand</a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="h"><a href="${pageContext.request.contextPath }/controller/user/tonewindex.do">首页</a></li>
                    <li class="dropdown h">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">产品中心 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="${pageContext.request.contextPath }/controller/user/tonewproduct.do">PCIe板卡产品</a></li>
                            <li><a href="#">FMC板卡产品</a></li>
                            <li><a href="#">以太网数据采集卡</a></li>
                            <li><a href="#">VPX产品</a></li>
                            <li><a href="#">射频产品</a></li>
                            <li><a href="#">PCIe数据采集系统</a></li>
                            <li><a href="#">高速图像类产品</a></li>
                            <li><a href="#">测控软件开发</a></li>
                        </ul>
                    </li>
                    <li class="dropdown h">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">成功案例 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">超声</a></li>
                            <li><a href="#">雷达</a></li>
                            <li><a href="#">原子物理</a></li>
                            <li><a href="#">电力局放</a></li>
                            <li><a href="#">无线电</a></li>
                            <li><a href="#">光电</a></li>
                            <li><a href="#">质谱</a></li>
                            <li><a href="#">光纤传感</a></li>
                        </ul>
                    </li>
                    <li class="dropdown h">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">行业与应用 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">超声</a></li>
                            <li><a href="#">质谱</a></li>
                            <li><a href="#">电力</a></li>
                            <li><a href="#">气象</a></li>
                            <li><a href="#">雷达</a></li>
                            <li><a href="#">光纤传感</a></li>
                            <li><a href="#">原子物理</a></li>
                            <li><a href="#">无线电</a></li>
                            <li><a href="#">光电</a></li>
                        </ul>
                    </li>
                    <li class="dropdown h">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">服务与支持 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">技术动态</a></li>
                            <li><a href="#">常见问题</a></li>
                            <li><a href="#">下载专区</a></li>
                            <li><a href="#">坤驰百科</a></li>
                            <li><a href="#">培训视频</a></li>
                        </ul>
                    </li>
                    <li class="dropdown h">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">关于坤驰 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">公司简介</a></li>
                            <li><a href="#">团队风采</a></li>
                            <li><a href="#">坤驰动态</a></li>
                            <li><a href="#">发展历程</a></li>
                            <li><a href="#">荣誉资质</a></li>
                            <li><a href="#">产品检验流程</a></li>
                            <li><a href="#">视频中心</a></li>
                        </ul>
                    </li>
                    <li class="dropdown h">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                            aria-expanded="false">联系我们 <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">联系方式</a></li>
                            <li><a href="#">人才招聘</a></li>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-right">
                    <div class="form-group">
                        <input type="text" class="form-control " placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">查询</button>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <div class="row">
        <div>
            <div id="carousel-example-generic" data-ride="carousel" class="carousel slide">
                <!-- 轮播指标 -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>
                <!-- 填图！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！ -->
                <!-- 轮播项目 -->
                <div class="carousel-inner">
                    <div class="item active"><img src='${picPath}shouye1.jpg' alt="" class="slide-image"></div>
                    <div class="item"><img src='${picPath}shouye2.jpg' alt="" class="slide-image"></div>
                    <div class="item"><img src='${picPath}shouye3.jpg' alt="" class="slide-image"></div>
                </div>
                <!-- 轮播导航 -->
                <a href="#carousel-example-generic" class="left carousel-control" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span></a>
                <a href="#carousel-example-generic" class="right carousel-control" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
        </div>
    </div>
    <br>
    <br>
    <br>



    <footer style="text-align:center;background-color: rgb(91, 197, 247)">
        <br>

        <div
            style="display: block;margin: 0 auto;text-align:center;border-radius: 50px; padding: 10px auto; width: 800px;height: 200px; background-color:white">
            <br>
            <strong>北京坤驰科技有限公司</strong><br>
            北京市海淀区上地信息路1号B栋金远见418室<br>
            电话：(123) 010-82894332 <br>
            E-mail：<a href="mailto:#">info@queentest.com</a> <br>
            北京坤驰科技有限公司 版权所有 备案号:CP备09003324号-3
            <br><br>
        </div>
        <br>
    </footer>

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/holder/2.9.4/holder.js"></script>
</body>
</html>