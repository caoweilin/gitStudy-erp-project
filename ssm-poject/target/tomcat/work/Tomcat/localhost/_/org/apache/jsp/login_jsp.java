/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-02 03:39:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>登录</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t");
 
	pageContext.setAttribute("APP_PATH", request.getContextPath());

      out.write("\n");
      out.write("\n");
      out.write("<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-1.12.4.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/css/bootstrap.min.css\"></link>\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("\t   background: url(images/a.jpg)repeat;\n");
      out.write("\t}\n");
      out.write("\t#login-box {\n");
      out.write("\t\tborder:1px solid #798A8F;\n");
      out.write("\t\tpadding: 35px;\n");
      out.write("\t\tborder-radius:15px;\n");
      out.write("\t\tbackground: #719BAC;\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<!-- 注册模态框 -->\n");
      out.write("\t<div class=\"modal fade\" id=\"registerModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("\t  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t    <div class=\"modal-content\">\n");
      out.write("\t      <div class=\"modal-header\">\n");
      out.write("\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t        <h4 class=\"modal-title\" id=\"myModalLabel\">注册</h4>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-body\">\n");
      out.write("\t        <form class=\"form-horizontal\" method=\"post\">\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">用户名</label>\n");
      out.write("\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control\" id=\"userName_id\" name=\"userName\"  placeholder=\"请填写用户名\">\n");
      out.write("\t\t\t      <span class=\"help-block\"></span>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">密码</label>\n");
      out.write("\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t      <input type=\"password\" class=\"form-control\" id=\"password_id\" name=\"password\"  placeholder=\"请填写密码\">\n");
      out.write("\t\t\t      <span class=\"help-block\"></span>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">学历</label>\n");
      out.write("\t\t\t    <div class=\"col-sm-6\">\n");
      out.write("\t\t\t      <select class=\"form-control\" name=\"education\" id=\"education_id\">\n");
      out.write("\t\t\t\t\t  <option value=\"本科\">本科</option>\n");
      out.write("\t\t\t\t\t  <option value=\"研究生\">研究生</option>\n");
      out.write("\t\t\t\t\t  <option value=\"博士\">博士</option>\n");
      out.write("\t\t\t\t\t  <option value=\"其他\">其他</option>\n");
      out.write("\t\t\t\t  </select>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">邮箱</label>\n");
      out.write("\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t      <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email_id\" placeholder=\"请输入邮箱\">\n");
      out.write("\t\t\t      <span class=\"help-block\"></span>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">性别</label>\n");
      out.write("\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t  <label class=\"radio-inline\">\n");
      out.write("\t\t\t\t    <input type=\"radio\" name=\"gender\" id=\"model_add_gender1\" checked=\"checked\" value=\"M\"> 男\n");
      out.write("\t\t\t\t  </label>\n");
      out.write("\t\t\t\t    <label class=\"radio-inline\">\n");
      out.write("\t\t\t\t  \t<input type=\"radio\" name=\"gender\" id=\"model_add_gender2\" value=\"F\"> 女\n");
      out.write("\t\t\t\t   </label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-footer\">\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-primary\" id=\"btn_add_user\">增加</button>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- 登录提交的表单 -->\n");
      out.write("\t<div class=\"container\" id=\"top\">\n");
      out.write("\t\t<div class=\"row\" style=\"margin-top: 150px; \">\n");
      out.write("\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t\t<div class=\"col-md-4\" id=\"login-box\">\n");
      out.write("\t\t\t\t<form class=\"form-horizontal\" role=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/login.do\" id=\"form_login_id\"  method=\"post\">\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t    <label for=\"firstname\" class=\"col-sm-3 control-label\">用户名</label>\n");
      out.write("\t\t\t\t    <div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t      <input type=\"text\" class=\"form-control\"  placeholder=\"请输入用户名\" name=\"userName\" id=\"empName_add_input\">\n");
      out.write("\t\t\t\t       <span id=\"span_login_id\" class=\"help-block\"></span>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t    <label for=\"lastname\" class=\"col-sm-3 control-label\">密码</label>\n");
      out.write("\t\t\t\t    <div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t      <input type=\"password\" class=\"form-control\"  placeholder=\"请输入密码\" name=\"password\" id=\"pwd_add_input\">\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t    <div class=\"col-sm-offset-3 col-sm-10\">\n");
      out.write("\t\t\t\t      <div class=\"checkbox\">\n");
      out.write("\t\t\t\t        <label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t  <input type=\"radio\" name=\"roleId\" id=\"inlineRadio1\" value=\"1\" checked=\"checked\"> 管理员\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t  <input type=\"radio\" name=\"roleId\" id=\"inlineRadio2\" value=\"2\"> 员工\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t<label class=\"radio-inline\">\n");
      out.write("\t\t\t\t\t\t  <input type=\"radio\" name=\"roleId\" id=\"inlineRadio3\" value=\"3\"> 游客\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t      </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t    <div class=\"col-md-offset-6 col-md-10\">\n");
      out.write("\t\t\t\t      <button type=\"button\" class=\"btn btn-default btn-info\" id=\"btn_login\" onclick = \"loginPer();\">登录</button>\n");
      out.write("\t\t\t\t      <button type=\"button\" class=\"btn btn-info\" id=\"btn_register\" >注册</button>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t//清空form\n");
      out.write("\t\t\treset_form(\"#form_login_id\");\n");
      out.write("\t\t});\t\n");
      out.write("\t\t\n");
      out.write("\t\t//清空表单样式及内容\n");
      out.write("\t\tfunction reset_form(ele){\n");
      out.write("\t\t\t$(ele)[0].reset();\n");
      out.write("\t\t\t//清空表单样式\n");
      out.write("\t\t\t$(ele).find(\"*\").removeClass(\"has-error has-success\");\n");
      out.write("\t\t\t$(ele).find(\".help-block\").text(\"\");\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//===================================登录校验===========================================\n");
      out.write("\t\t//显示校验结果的提示信息\n");
      out.write("\t\tfunction show_validate_msg(ele,status,msg){\n");
      out.write("\t\t\t//清除当前元素的校验状态\n");
      out.write("\t\t\t$(ele).parent().removeClass(\"has-success has-error\");\n");
      out.write("\t\t\t$(ele).next(\"span\").text(\"\");\n");
      out.write("\t\t\tif(\"success\"==status){\n");
      out.write("\t\t\t\t$(ele).parent().addClass(\"has-success\");\n");
      out.write("\t\t\t\t$(ele).next(\"span\").text(msg);\n");
      out.write("\t\t\t}else if(\"error\" == status){\n");
      out.write("\t\t\t\t$(ele).parent().addClass(\"has-error\");\n");
      out.write("\t\t\t\t$(ele).next(\"span\").text(msg);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//校验用户名是否可用\n");
      out.write("\t\t$(\"#empName_add_input\").change(function(){\n");
      out.write("\t\t\t//发送ajax请求校验用户名是否可用\n");
      out.write("\t\t\tvar empName = this.value;\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/checkuser\",\n");
      out.write("\t\t\t\tdata:\"empName=\"+empName,\n");
      out.write("\t\t\t\ttype:\"POST\",\n");
      out.write("\t\t\t\tsuccess:function(result){\n");
      out.write("\t\t\t\t\tif(result.code==100){\n");
      out.write("\t\t\t\t\t\tshow_validate_msg(\"#empName_add_input\",\"success\",\"用户名存在\");\n");
      out.write("\t\t\t\t\t\t$(\"#emp_save_btn\").attr(\"ajax-va\",\"success\");\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\tshow_validate_msg(\"#empName_add_input\",\"error\",\"用户名不存在\");\n");
      out.write("\t\t\t\t\t\t$(\"#emp_save_btn\").attr(\"ajax-va\",\"error\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//=================================注册=================================================\n");
      out.write("\t\t\t//点击注册按钮\n");
      out.write("\t\t$(\"#btn_register\").click(function() {\n");
      out.write("\t\t\t//清空值表单\n");
      out.write("\t\t\treset_form(\"#registerModal form\");\n");
      out.write("\t\t\t//弹出模态框\n");
      out.write("\t\t\t$(\"#registerModal\").modal({\n");
      out.write("\t\t\t\tbackdrop:\"static\"\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}); \n");
      out.write("\t\t\n");
      out.write("\t\t//提交注册表单\n");
      out.write("\t\t$(\"#btn_add_user\").click(function() {\n");
      out.write("\t\t\t//错误信息禁止提交\n");
      out.write("\t\t\tif(!checkRegister()) {\n");
      out.write("\t\t\t\talert(\"请按提示输入正确信息!\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t} \n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/register\",\n");
      out.write("\t\t\t\ttype : \"POST\",\n");
      out.write("\t\t\t\tdata : $(\"#registerModal form\").serialize(),\n");
      out.write("\t\t\t\tsuccess : function(e) {\n");
      out.write("\t\t\t\t\tif(e) {\n");
      out.write("\t\t\t\t\t\t//后端校验\n");
      out.write("\t\t\t\t\t\tif(e.code == 200) {\t\n");
      out.write("\t\t\t\t\t\t\tif(undefined != e.map.errorFields.userName){\n");
      out.write("\t\t\t\t\t\t\t\tshow_validate_msg(\"#userName_id\", \"error\", e.map.errorFields.userName);\n");
      out.write("\t\t\t\t\t\t\t\talert(\"提交失败，用户名不可用\");\n");
      out.write("\t\t\t\t\t\t\t }\n");
      out.write("\t\t\t\t\t\t\tif(undefined != e.map.errorFields.password){\n");
      out.write("\t\t\t\t\t\t\t\tshow_validate_msg(\"#password_id\", \"error\", e.map.errorFields.password);\n");
      out.write("\t\t\t\t\t\t\t\talert(\"提交失败，密码不可用\");\n");
      out.write("\t\t\t\t\t\t\t }\n");
      out.write("\t\t\t\t\t\t\tif(undefined != e.map.errorFields.email){\n");
      out.write("\t\t\t\t\t\t\t\talert(\"提交失败，邮箱不可用\");\n");
      out.write("\t\t\t\t\t\t\t\tshow_validate_msg(\"#email_id\", \"error\", e.map.errorFields.email);\n");
      out.write("\t\t\t\t\t\t\t }\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t}else {\n");
      out.write("\t\t\t\t\t\t\talert(\"注册成功\");\n");
      out.write("\t\t\t\t\t\t\t//关闭模态框\n");
      out.write("\t\t\t\t\t\t\t$(\"#registerModal\").modal('hide')\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t//是否校验都通过\n");
      out.write("\t\tfunction checkRegister() {\n");
      out.write("\t\t\tif(!userNameCheck()){\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(!pwdCheck()){\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(!emailCheck()){\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\t//1、拿到要校验的数据，使用正则表达式\n");
      out.write("\t\tfunction userNameCheck() {\n");
      out.write("\t\t\tvar empName = $(\"#userName_id\").val();\n");
      out.write("\t\t\t//var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})/;\n");
      out.write("\t\t\tvar regName = /(^[\\u2E80-\\u9FFF]{2,5}$)/;\n");
      out.write("\t\t\tif(!regName.test(empName)){\n");
      out.write("\t\t\t\t//alert(\"用户名为2-5位中文\");\n");
      out.write("\t\t\t\tshow_validate_msg(\"#userName_id\", \"error\", \"用户名为2-5位中文\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tshow_validate_msg(\"#userName_id\", \"success\", \"\");\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\t//2、校验密码\n");
      out.write("\t\tfunction pwdCheck() {\n");
      out.write("\t\t\tvar pwd = $(\"#password_id\").val();\n");
      out.write("\t\t\tvar regPwd=/^[A-Za-z]+[0-9]+[A-Za-z0-9]*|[0-9]+[A-Za-z]+[A-Za-z0-9]*$/g;\n");
      out.write("\t\t\tif(!regPwd.test(pwd)) {\n");
      out.write("\t\t\t\tshow_validate_msg(\"#password_id\", \"error\", \"密码必须由6-16个英文字母和数字的字符串组成\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else {\n");
      out.write("\t\t\t\tshow_validate_msg(\"#password_id\", \"success\", \"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\t//3、校验邮箱信息\n");
      out.write("\t\tfunction emailCheck() {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar email = $(\"#email_id\").val();\n");
      out.write("\t\t\tvar regEmail = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\n");
      out.write("\t\t\tif(!regEmail.test(email)){\n");
      out.write("\t\t\t\tshow_validate_msg(\"#email_id\", \"error\", \"邮箱格式不正确\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\tshow_validate_msg(\"#email_id\", \"success\", \"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t\t$(\"#userName_id\").change(function() {\n");
      out.write("\t\t\tuserNameCheck();\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#password_id\").change(function() {\n");
      out.write("\t\t\tpwdCheck();\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#email_id\").change(function() {\n");
      out.write("\t\t\temailCheck();\n");
      out.write("\t\t});\n");
      out.write("\t\t//================================手动提交表单================================================\n");
      out.write("\t\tfunction loginPer() {\n");
      out.write("\t\t\tif($(\"#pwd_add_input\").val() == '') {\n");
      out.write("\t\t\t\talert('请输入密码！');\t\t\t\t\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif($(\"#span_login_id\").text() == '用户名不存在') {\n");
      out.write("\t\t\t\talert('用户名有误！');\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#form_login_id\").submit();\t\t\t\n");
      out.write("\t\t}\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
