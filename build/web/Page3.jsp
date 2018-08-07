<%-- 
    Document   : Page3
    Created on : Aug 6, 2018, 4:30:49 PM
    Author     : Mahmoud
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background-color: #e6ecf0;">
        <div class="container" style="width: 100%; height: 300px; background-image: url(img/login.jpg) ;padding: 0%">
            <div class="container" style="width:100%; height: 50px; background-color: white">
                <nav class="navbar navbar-nav navbar-fixed-top" style="background-color: white">
                    <div class="container-fluid">
                        <!--  <div class=" navbar-header" style="float: none; margin-left:1000px; margin-top: 30spx;">
                                                             <button class="navbar-header">Tweet</button>         
                                               </div> -->
                        <ul class="nav navbar-nav"  style="padding-left:120px;">
                            <li ><a href="#">  <span class="g glyphicon glyphicon-home"/><tr/>  Home</a></li>
                            <li><a href="#">  <span class="g glyphicon glyphicon-bell"/><tr/> Notifications</a></li>
                            <li><a href="#"> <span class="g glyphicon glyphicon-envelope"/> <tr/>Messages</a></li>
                        </ul>
                        <div class="navbar-header">
                            <a class="navbar-brand" href="#"> <img src="img/images.png"  style="width: 30px; height: 30px; margin-left: 150px;"alt=""/></a>
                        </div>
                        <div class="form-group has-success has-feedback">
                            <div class="col-sm-2" style="margin-top: 10px; margin-left: 100px;">
                                <input type="text" class="form-control" id="inputSuccess" style="border-radius: 50px; "placeholder="Search Twitter" >
                                <span  style=" margin-right: 10px;"class="glyphicon glyphicon-search form-control-feedback"></span>
                            </div>
                            <a href="newPage.jsp"> <img  style="height: 35px; margin-top: 3px;"src="img/Screenshot (114).png" alt=""/></a>
                            <button style=" margin-top: 10px  ; border-radius: 50px;background-color: #4AB3F4" type="button"class="btn btn-primary"> Tweet</button>
                        </div>
                        <!--                <div class="input-group" style=" float: right;width:200px; padding-top: 9px ; margin-right:350px;">
                                                                <input   style=" border-radius:50px;"type="search"  class=" glyphicon-search , form-control" name="search" placeholder="search">
                                                                <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
                                                            </div>-->
                    </div>
                </nav>
            </div>
            <div class="container" style="width:100%; height: 60px; margin-top: 200px; background-color: white;">
                <nav class="navbar navbar-bottom">
                    <div style="margin-left: 500px;">
                        <ul class="nav navbar-nav">
                            <li><a href="#">Tweets<br/>11</a></li>
                            <li><a href="#">Following<br/>15</a></li>
                            <li><a href="#">Followers<br/>2</a></li>
                            <li><a href="#">Likes<br/>110</a></li>
                            <li><a href="#">Lists<br/>1</a></li>
                            <li><a href="#">Moments<br/>111</a></li>
                        </ul>
                        <button style="margin-top: 10px; margin-left: 30px ; border-radius: 50px" type="button" class="btn btn-default">Edit Profile</button>
                </nav>
            </div> 
        </div>
        <div class="col-sm-8" style="margin-top: -120px; margin-left: 170px;">
            <img style="width: 120px; height: 120px; border-radius: 50%" src="img/zzz.jpg" alt=""/>
        </div>



        <div class="container" style="background-color:  #e6ecf0; width: 20%;height: 250px;margin-left: 200px; margin-top: 20px;">
            <h4><a href="#" style="color: black"><b/>Mahmoud_Alsheikh</a></h4>
            <a  href="#" style="color: black">@mahmoud201420504</a>
            <br/>Information security technology
            <span class="glyphicon glyphicon-home"> <tr/> Jordan _amman</span>
            <span class=" glyphicon glyphicon-calendar"> <tr/> Joined June 2016</span>
            <span class=" glyphicon glyphicon-bold"> Born on July 4, 1996 </span>
            <span class="glyphicon glyphicon-picture"><a href="#" style="color: black"> <tr/>Photos and videos</a></span>
            <img src="img/zxc.png" alt=""/>
        </div>


        <div class="container" style="background-color: white; width: 35%;height: 550px;margin-top:-250px;margin-left: 510px;">
            <br/> <b>Tweets</b><a style="padding-left: 40px;"href="#">Tweets & replies</a>
            <a style="padding-left: 40px;"href="#">Media</a><hr/>

            <img  style="width: 60px;height: 60px; border-radius: 50px;"src="img/zzz.jpg" alt=""/>
            <a href="#" style="color: black">@Mahmoud61024033</a>
            31 Mar 2017
            ‏More
            Just posted a photo <a href="#"> https://www.instagram.com/p/BSVWJoyABtwnwvnBO6I3kBBzIu-n3IBVBwFLDU0/ …</a><hr/>

            <img  style="width: 60px;height: 60px; border-radius: 50px;"src="img/zzz.jpg" alt=""/>
            <a href="#" style="color: black">@Mahmoud61024033</a>
            31 Mar 2017
            ‏More
            Just posted a photo <a href="#"> https://www.instagram.com/p/BSVWJoyABtwnwvnBO6I3kBBzIu-n3IBVBwFLDU0/ …</a><hr/>

            <img  style="width: 60px;height: 60px; border-radius: 50px;"src="img/zzz.jpg" alt=""/>
            <a href="#" style="color: black">@Mahmoud61024033</a>
            31 Mar 2017
            ‏More
            Just posted a photo <a href="#"> https://www.instagram.com/p/BSVWJoyABtwnwvnBO6I3kBBzIu-n3IBVBwFLDU0/ …</a><hr/>

        </div>


        <div class="container" style="background-color:white; width: 20%;height: 250px;margin-left: 1000px; margin-top : -550px;">
            <h4> How to follow <sub> - <a href="#">Refresh</a> <tr/> <tr/> -<a href="#">View all</a></sub><h4/> 
                <a href="#"><img src="img/Screenshot (114).png" alt=""/></a> <a style="font-size: 10px;">Mahmoud_Alsheikh</a>
                <button class=" btn btn-outline-primary" type="button" style=" background-color:#1da1f2; border-radius: 50px;">follow</button>
                <span  style="margin-left: 40px; margin-top: 5px;"class=" glyphicon glyphicon-envelope"><a style="margin-left: 10px;">Promoted</a></span><hr/>
                <a href="#"><img style="height: 50px; width: 50px"src="img/ali.png" alt=""/></a> <a style="font-size: 10px;">Ali mousa</a>
                <button class=" btn btn-outline-primary" type="button" style=" background-color:#1da1f2; border-radius: 50px;">follow</button>
                <span style="margin-left: 40px;"class=" glyphicon glyphicon-envelope"><a style="margin-left:10px;">Promoted</a></span>

        </div>

        <div class="container" style="background-color:white; width: 20%;height: 250px;margin-left: 1000px; margin-top : 10px;">

            <br> <b/> Trends for you <sub/><a> -Change</a><br/>
            <a href="#"><h4>#السعوديه_تطرد_السفير_الكندي</h4></a>@Ayed_Alosaimi and @khaberni are Tweeting about this<br/>
            <a href="#"><h4>#اخبارالاردن_24</h4></a>#jordan the news in aqaba......<br/>
            <a href="#"><h4>#اعتزال_محمد_عبده</h4>
            </a>3,519 Tweets....<br/>
            <a href="#"><h4>#وش_يعني_اسمك</h4></a><br/>
        </div>


        <div class="container" style="background-color:#e6ecf0; width: 20%;height: 150px;margin-left: 1000px; margin-top : 10px;">
            © 2018 Twitter About Help Center Terms Privacy policy Cookies Ads info
        </div>



















        <script src="bootstrap-3.3.7-dist/css/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>     
    </body>
</html>
