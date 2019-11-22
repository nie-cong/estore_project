<%@page import="com.briup.service.SCateDetailService"%>
<%@page import="com.briup.service.SCateService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.briup.bean.*"%>
<%@page import="com.briup.service.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购书系统-首页</title>
<link rel="stylesheet" href="css/common.css"/>
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
</head>
<body>
<!-- 获取书的信息 -->
	<!--顶部-->
	
	<div class="top">
    	<div class="top_center">
    		<ul class="top_lr">
            	<li><a href="login.html" style="color: red;">欢迎：<%=request.getSession().getAttribute("username")%>！</a></li>
                <li><a href="register.html">免费注册</a></li>
            </ul>
            <ul class="top_bars">
                <li><a href="confirmList.html">我的订单<span class="jt_down"></span></a>|</li>
                <li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
                <li><a href="#">网站导航<span class="jt_down"></span></a></li>
            </ul>
        </div>
    </div>
    <!--头部-->
    <div class="header3">
    	<a href="index.jsp"><img src="images/logo.png"></a>
    	<div class="h3_center">
        	<div class="search_box">
            	<input type="text"/>
                <span>搜索</span>
            </div>
            <p>
            
            <%--拿到各类图书的从s_cate表中 --%>
        	<% 
            SCateService service=new SCateService();
            List<SCate> list1=service.selectAllSCate();
            for(SCate scate:list1){		
    			out.print("<a href='list.html'>"+scate.getName()+"</a>|");	
    		} 
            %>
            </p>
        </div>
        <div class="h3_right">
        	<div class="myyy">
            	<a href="userinfo.html">个人信息</a>
                <span class="sj_down"></span>
             </div>
            <div class="tsc">
           	  <a href="emptyCar.html">去购物车结算</a>
              <span class="sj_right"> </span>
            </div>
        </div>
    </div>
    <!--头部导航-->
    <div class="nav_top">
    	<div class="nav_top_center">
            <div>
                	全部图书分类
            </div>
            <ul>
            <% 
            //上面拿到了所有图书分类
            for(SCate scate:list1){		
    			out.print("<li><a href='list.html'>"+scate.getName()+"</a></li>");	
    		} 
            %>
            </ul>
        </div>
    </div>
    
    					<%-- 拿到SCateDetai书信息--%>
                    	<%
                    	SCateDetailService Detailservice=new SCateDetailService();
                    	List<SCateDetail> list2= Detailservice.selectSCateDetail();
                 
                    	%>
                    	
	<div class="container3">
    	<div class="c3_b1">
        	<div class="c3_b1_left">
            	<dl>
               		
               		<%
               		//一级目录为map的key，二级目录为value的list集合
               		Map<SCate, List<SCateDetail>> map = new TreeMap<SCate, List<SCateDetail>>(new Comparator<SCate>() {

            			public int compare(SCate arg0, SCate arg1) {
            				return (int) (arg0.getId()-arg1.getId());
            			}
            		});
            		
            		//准备一个List集合
            			
            		for(SCate s1 : list1) {
            			//循环一次一个新的list
            			List<SCateDetail> s2list = new ArrayList<SCateDetail>();	
            			for(SCateDetail s2 : list2) {
            				if(s2.getCategoryId().equals(s1.getId())){
            					s2list.add(s2);
            				}
            			}
            			map.put(s1, s2list);

            		} 
               		%>
               		<!--  将静态页面改为从数据库中拿目录数据动态显示出来-->
               	  <%
               	  
               		for(SCate s1 : list1){
               			out.print("<dd>");	
               			out.print("<h1>"+s1.getName()+"</h1>");
               			out.print("<p>");
               			List<SCateDetail> listScateDetail=map.get(s1);
               			for(SCateDetail sd:listScateDetail){
               				/* System.out.println(sd); */
               				out.print("	<a href='list.html'>"+sd.getName()+"</a>");	
               				}
               			out.print("</p>");
               			out.print("</dd>");	
               			}
               	  
               		%>
               		<!-- <dd>
                    	<h1>文学类</h1>
                    	<p>
                        	 <a href="list.html">文学1</a>
                           	<a href="list.html">文学2</a>
                            <a href="list.html">文学3</a>
                            <a href="list.html">文学4</a>
                      	</p>
                    </dd>
                    
                    <dd>
                    	<h1>教育类</h1>
                    	<p>
                    
                            <a href="list.html">教育1</a>
                           	<a href="list.html">教育2</a>
                      	</p>
                    </dd>
                    
                    <dd>
                    	<h1>计算机类</h1>
                    	<p>
                           	<a href="list.html">计算机1</a>
                            <a href="list.html">计算机2</a>
                            <a href="list.html">计算机3</a>
                      	</p>
                    </dd>
                    
                    <dd>
                    	<h1>图书类</h1>
                    	<p>
                        	<a href="list.html">图书1</a>
                           	<a href="list.html">图书2</a>
                            <a href="list.html">图书3</a>
                      	</p>
                    </dd>
                    
                    <dd>
                    	<h1>漫画类</h1>
                    	<p>
                        	<a href="list.html">漫画1</a>
                      	</p>
                    </dd>
                    
                    <dd>
                    	<h1>工具类</h1>
                    	<p>
                        	<a href="list.html">工具书1</a>
                           	<a href="list.html">工具书2</a>
                      	</p>
                    </dd>
                    
                    <dd class="last">
                    	<h1>期刊类</h1>
                    	<p>
                        	<a href="list.html">期刊1</a>
                           	<a href="list.html">期刊2</a>
                            <a href="list.html">期刊3</a>
                      	</p>
                    </dd> -->
                </dl>
            </div>
            <%
            SProductService SPservice=new SProductService();
            List<SProduct> sPlist=SPservice.selectAllProduct();
            
            %>
            
            <!--中心显示图片  -->
            <div class="c3_b1_center">
            	<div>
            	<%--没有圆梦巨人这本书，所有点击大图跳转到id=1的书，后期完善 --%>
                	<a href="viewBook.jsp?id=1"><img src="images/ad1.png"></a>
                </div>
                <div class="c3_b1_c_bottom">
                    <ul>
                    <% 
                    for(SProduct sp:sPlist){
                    	out.print("<li>");
                    	out.print(" <a href='viewBook.jsp?id="+sp.getId()+"'><img src='"+sp.getImg()+"' width='150' height='150'/></a>");
                    	out.print("<a href='viewBook.jsp?id="+sp.getId()+"'>"+sp.getName()+"</a>");
                    	out.print("</li>");
                    	
                    }
                    %>
                        <!-- <li>
                           <a href="viewBook.jsp"><img src="images/p01.png"/></a>
                           <a href="viewBook.jsp">Java从入门到精通</a>  
                        </li>
                       <li>
                           <a href="viewBook.jsp"><img src="images/p01.png"/></a> 
                           <a href="viewBook.jsp">Java从入门到精通</a> 
                        </li>
                        <li>
                           <a href="viewBook.jsp"><img src="images/p01.png"/></a> 
                           <a href="viewBook.jsp">Java从入门到精通</a> 
                        </li> -->
                    </ul>
            	</div>
            </div>
            <div class="c3_b1_right">
            	<h1>杰普快报</h1>
            	<ul>
                	<li><a href="detail.html">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                	<li><a href="detail.html">〈加措〉相信这一切都是对我们最好的安排  </a></li>
                </ul>
            </div>
            <div style="clear:both"></div>
        </div>
     </div>
    <div class="c20"></div>
    <!--脚部-->
    <div class="footer3">
    	<div class="f3_top">
        	<div class="f3_center">
                <div class="ts1">品目繁多 愉悦购物</div>
                <div class="ts2">正品保障 天天低价</div>
                <div class="ts3">极速物流 特色定制</div>
                <div class="ts4">优质服务 以客为尊</div>
            </div>
        </div>
        <div class="f3_middle">
        	<ul class="f3_center">
            	<li class="f3_mi_li01">
                	<h1>购物指南</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>配送方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>支付方式</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>售后服务</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li01">
                	<h1>服务保障</h1>
                    <p>常见问题</p>
                    <p>找回密码</p>
                    <p>会员介绍</p>
                    <p>购物演示</p>
                </li>
                <li class="f3_mi_li06">
                	<h1>客服中心</h1>
                    <img src="images/qrcode_jprj.jpg" width="80px" height="80px">
                    <p>抢红包、疑问咨询、优惠活动</p>
                </li>
            </ul>
        </div>
        <div class="f3_bottom">
        	<p class="f3_links">
                <a href="#">关于我们</a>|
                <a href="#">联系我们</a>|
                <a href="#">友情链接</a>|
                <a href="#">供货商入驻</a> 
           	</p>
            <p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司 </p>
          	<img src="images/police.png">
        </div>
    </div>

</body>
</html>
