/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-07 05:36:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class attendanceSheet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>个人考勤</title>\n");
 
	pageContext.setAttribute("APP_PATH", request.getContextPath());

      out.write("\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->\n");
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
      out.write("\t");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- 顶栏 -->\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\n");
      out.write("\t<!-- 中间主体 -->\n");
      out.write("\t<div class=\"container\" id=\"content\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t    <div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t    \t<h1 class=\"col-md-5\">个人考勤</h1>\n");
      out.write("\t\t\t\t\t\t\t<form class=\"bs-example bs-example-form col-md-5\" role=\"form\" style=\"margin: 20px 0 10px 0; id=\"form_attendance_sheet\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t   <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">搜索</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t   <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t   \t   <label  >年份</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   <select class=\"form-control\" id=\"select_year\" name=\"years\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t   \t<option value=0></option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label>月份</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"select_month\" name=\"months\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=0></option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t    <button type=\"button\" class=\"btn btn-danger\" id=\"btn_in_work\">上班打卡</button>\n");
      out.write("\t        \t\t<button type=\"button\" class=\"btn btn-info\" id=\"btn_out_work\">下班打卡</button>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    <table class=\"table table-bordered\" id=\"table_id\">\n");
      out.write("\t\t\t\t\t        <thead>\n");
      out.write("\t\t\t\t\t            <tr>\n");
      out.write("\t\t\t\t\t            \t<th>序号</th>\n");
      out.write("\t\t\t\t\t            \t<th>年份</th>\n");
      out.write("\t\t\t\t\t            \t<th>月份</th>\n");
      out.write("\t\t\t\t\t            \t<th>天</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>上班时间</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>下班时间</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>状态</th>\n");
      out.write("\t\t\t\t\t            </tr>\n");
      out.write("\t\t\t\t\t        </thead>\n");
      out.write("\t\t\t\t\t        <tbody>\n");
      out.write("\t\t\t\t\t        </tbody>\n");
      out.write("\t\t\t\t    </table>\n");
      out.write("\t\t\t\t    <div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t<nav style=\"text-align: center\" id=\"nav_id\">\n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div id=\"page_id\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\" id=\"footer\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-12\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t//当前页面\n");
      out.write("\tvar currentPage;\n");
      out.write("\t $(function() {\n");
      out.write("\t\t //给查询按钮添加年份月份\n");
      out.write("\t\t fill_check_year();\n");
      out.write("\t\t to_page(1);\n");
      out.write("\t\t \n");
      out.write("\t });\n");
      out.write("\t \n");
      out.write("\t//给查询按钮添加年份月份\n");
      out.write("\t function fill_check_year() {\n");
      out.write("\t\tvar baseYear = 2015;\n");
      out.write("\t\tvar date=new Date;\n");
      out.write("\t\t var year=date.getFullYear(); \n");
      out.write("\t\t var month=date.getMonth()+1;\n");
      out.write("\t\tfor(baseYear; baseYear < 2050; baseYear++) {\n");
      out.write("\t\t\tif(year == baseYear) {\n");
      out.write("\t\t\t\tvar yearOption = $(\"<option></option>\").attr(\"value\", baseYear).attr(\"selected\", \"selected\")\n");
      out.write("\t\t\t\t.append(baseYear).appendTo($(\"#select_year\"));\n");
      out.write("\t\t\t}else {\n");
      out.write("\t\t\t\tvar yearOption = $(\"<option></option>\").attr(\"value\", baseYear)\n");
      out.write("\t\t\t\t.append(baseYear).appendTo($(\"#select_year\"));\n");
      out.write("\t\t  }\n");
      out.write("\t\t}\n");
      out.write("\t\tvar baseMonth = 1;\n");
      out.write("\t\tfor(baseMonth; baseMonth <= 12; baseMonth++) {\n");
      out.write("\t\t\tif(month == baseMonth) {\n");
      out.write("\t\t\t\tvar yearOption = $(\"<option></option>\").attr(\"value\", baseMonth).attr(\"selected\", \"selected\")\n");
      out.write("\t\t\t\t.append(baseMonth).appendTo($(\"#select_month\"));\n");
      out.write("\t\t\t}else {\n");
      out.write("\t\t\t\tvar yearOption = $(\"<option></option>\").attr(\"value\", baseMonth)\n");
      out.write("\t\t\t\t.append(baseMonth).appendTo($(\"#select_month\"));\n");
      out.write("\t\t  }\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t \n");
      out.write("\t \t//分页跳到第几页\n");
      out.write("\t\tfunction to_page(pn) {\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/attendance/AttendanceSheetData/\" + pn,\n");
      out.write("\t\t\t\ttype : \"GET\",\n");
      out.write("\t\t\t\tsuccess : function(e) {\n");
      out.write("\t\t\t\t\tvar e = e.map.pageInfo;\n");
      out.write("\t\t\t\t\tif(e) {\n");
      out.write("\t\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t\t\t//填充表格\n");
      out.write("\t\t\t\t\t\ttable_data(e);\n");
      out.write("\t\t\t\t\t\t//填充分页信息\n");
      out.write("\t\t\t\t\t\tpager_data(e);\n");
      out.write("\t\t\t\t\t\t//填充分页导航信息\n");
      out.write("\t\t\t\t\t\tnav_data(e);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t/* 填充表格数据 */\n");
      out.write("\t\tfunction table_data(e) {\n");
      out.write("\t\t\t//每次进入清空表格信息\n");
      out.write("\t\t\t$(\"#table_id tbody\").empty();\n");
      out.write("\t\t\tvar data = e.list;\n");
      out.write("\t\t\t$.each(data, function(index, item) {\n");
      out.write("\t\t\t\tvar idTd = $(\"<td></td>\").append(item.id);\n");
      out.write("\t\t\t\tvar yearsTd = $(\"<td></td>\").append(item.years);\n");
      out.write("\t\t\t\tvar monthsTd = $(\"<td></td>\").append(item.months);\n");
      out.write("\t\t\t\tvar daysTd = $(\"<td></td>\").append(item.days);\n");
      out.write("\t\t\t\tvar onWorkTimeTd = $(\"<td></td>\").append(item.onWorkTime);\n");
      out.write("\t\t\t\tvar outWorkTimeTd = $(\"<td></td>\").append(item.outWorkTime);\n");
      out.write("\t\t\t\tvar descriptTd = $(\"<td></td>\").append(item.descript);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t/* 加到表格下的<tbody>里面  */\n");
      out.write("\t\t\t\t$(\"<tr></tr>\").append(idTd).append(yearsTd).append(monthsTd)\n");
      out.write("\t\t\t\t.append(daysTd).append(onWorkTimeTd).append(outWorkTimeTd)\n");
      out.write("\t\t\t\t.append(descriptTd)\n");
      out.write("\t\t\t\t.appendTo(\"#table_id tbody\")\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t/* 填充分页信息 */\n");
      out.write("\t\tfunction pager_data(e) {\n");
      out.write("\t\t\t//清空分页信息\n");
      out.write("\t\t\t$(\"#page_id\").empty();\n");
      out.write("\t\t\t$(\"#page_id\").append($(\"<strong></strong>\")\n");
      out.write("\t\t\t  .append(\"当前是第\"+e.pageNum+\"页,共\"+e.pages\n");
      out.write("\t\t\t\t\t  +\"页,共\"+e.total+\"条记录\"));\n");
      out.write("\t\t\tcurrentPage = e.pageNum;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t/* 填充分页导航内容  */\n");
      out.write("\t\tfunction nav_data(e) {\n");
      out.write("\t\t\t//nav_id\n");
      out.write("\t\t\t$(\"#nav_id\").empty();\n");
      out.write("\t\t\tvar ul = $(\"<ul></ul>\").addClass(\"pagination\"); \n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar headLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"首页\").attr(\"href\", \"#\"));\n");
      out.write("\t\t\tvar previousLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&laquo;\"));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(e.pageNum != 1) {\n");
      out.write("\t\t\t\tul.append(headLi);\n");
      out.write("\t\t\t\tul.append(previousLi);\n");
      out.write("\t\t\t\theadLi.click(function() {\n");
      out.write("\t\t\t\t\tto_page(1);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tpreviousLi.click(function() {\n");
      out.write("\t\t\t\t\tto_page(e.pageNum - 1);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar nextLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&raquo;\"));\n");
      out.write("\t\t\tvar footLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"尾页\"));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$.each(e.navigatepageNums, function(index, item) {\n");
      out.write("\t\t\t\tvar pageLi = $(\"<li></li>\").append($(\"<a></a>\").append(item));\n");
      out.write("\t\t\t\tul.append(pageLi);\n");
      out.write("\t\t\t\tif(e.pageNum == item) {\n");
      out.write("\t\t\t\t\tpageLi.addClass(\"active\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tpageLi.click(function() {\n");
      out.write("\t\t\t\t\tto_page(item);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tif(e.pageNum != e.pages) {\n");
      out.write("\t\t\t\tul.append(nextLi);\n");
      out.write("\t\t\t\tul.append(footLi);\n");
      out.write("\t\t\t\tnextLi.click(function() {\n");
      out.write("\t\t\t\t\tto_page(e.pageNum + 1);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tfootLi.click(function() {\n");
      out.write("\t\t\t\t\tto_page(e.pages);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tul.appendTo(\"#nav_id\")\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t//====================================上班签到=====================================================\t\n");
      out.write("\t\t$(\"#btn_in_work\").click(function() {\n");
      out.write("\t\t\t//后台数据准备\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/attendance/pushCardInWork\",\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tif(data.code == 100) {\n");
      out.write("\t\t\t\t\t\talert(\"上班打卡成功！\");\n");
      out.write("\t\t\t\t\t\t to_page(currentPage);\n");
      out.write("\t\t\t\t\t}else if(data.code == 300) {\n");
      out.write("\t\t\t\t\t\t//按钮\n");
      out.write("\t\t\t\t\t\t alert(\"你已经打卡咯！\");\n");
      out.write("\t\t\t\t\t}else {\n");
      out.write("\t\t\t\t\t\talert(\"网络出错！\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\n");
      out.write("\t//=====================================下班签到========================================================\n");
      out.write("\t$(\"#btn_out_work\").click(function() {\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/attendance/pushCarOutWork\",\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tif(data.code == 200) {\n");
      out.write("\t\t\t\t\t//没上班打卡\n");
      out.write("\t\t\t\t\talert(\"亲，你还没有上班打卡呢！\");\n");
      out.write("\t\t\t\t}else {\n");
      out.write("\t\t\t\t\talert(\"下班打卡成功！\");\n");
      out.write("\t\t\t\t\tto_page(currentPage)\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}); \n");
      out.write("\t\t\n");
      out.write("\t//=====================================日期选择=======================================================\n");
      out.write("\t\t$(\"#select_month\").change(function() {\n");
      out.write("\t\t\tvar years = $(\"#select_year\").val();\n");
      out.write("\t\t\tvar months = $(\"#select_month\").val();\n");
      out.write("\t\t\tif(years != 0) {\n");
      out.write("\t\t\t\t//选择对应年月份的记录\n");
      out.write("\t\t\t\tto_check_page(1);\n");
      out.write("\t\t\t}else {\n");
      out.write("\t\t\t\talert(\"请先填写年份！\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t//分页跳到第几页\n");
      out.write("\t\tfunction to_check_page(pn) {\n");
      out.write("\t\t\tvar years = $(\"#select_year\").val();\n");
      out.write("\t\t\tvar months = $(\"#select_month\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/attendance/getDateRecords/\"+pn,\n");
      out.write("\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\tyears : years,\n");
      out.write("\t\t\t\t\tmonths : months\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\tsuccess : function(e) {\n");
      out.write("\t\t\t\t\tvar e = e.map.pageInfo;\n");
      out.write("\t\t\t\t\tif(e) {\n");
      out.write("\t\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t\t\t//填充表格\n");
      out.write("\t\t\t\t\t\ttable_check_data(e);\n");
      out.write("\t\t\t\t\t\t//填充分页信息\n");
      out.write("\t\t\t\t\t\tpager_check_data(e);\n");
      out.write("\t\t\t\t\t\t//填充分页导航信息\n");
      out.write("\t\t\t\t\t\tnav_check_data(e);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t/* 填充表格数据 */\n");
      out.write("\t\tfunction table_check_data(e) {\n");
      out.write("\t\t\t//每次进入清空表格信息\n");
      out.write("\t\t\t$(\"#table_id tbody\").empty();\n");
      out.write("\t\t\tvar data = e.list;\n");
      out.write("\t\t\t$.each(data, function(index, item) {\n");
      out.write("\t\t\t\tvar idTd = $(\"<td></td>\").append(item.id);\n");
      out.write("\t\t\t\tvar yearsTd = $(\"<td></td>\").append(item.years);\n");
      out.write("\t\t\t\tvar monthsTd = $(\"<td></td>\").append(item.months);\n");
      out.write("\t\t\t\tvar daysTd = $(\"<td></td>\").append(item.days);\n");
      out.write("\t\t\t\tvar onWorkTimeTd = $(\"<td></td>\").append(item.onWorkTime);\n");
      out.write("\t\t\t\tvar outWorkTimeTd = $(\"<td></td>\").append(item.outWorkTime);\n");
      out.write("\t\t\t\tvar descriptTd = $(\"<td></td>\").append(item.descript);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t/* 加到表格下的<tbody>里面  */\n");
      out.write("\t\t\t\t$(\"<tr></tr>\").append(idTd).append(yearsTd).append(monthsTd)\n");
      out.write("\t\t\t\t.append(daysTd).append(onWorkTimeTd).append(outWorkTimeTd)\n");
      out.write("\t\t\t\t.append(descriptTd)\n");
      out.write("\t\t\t\t.appendTo(\"#table_id tbody\")\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t/* 填充分页信息 */\n");
      out.write("\t\tfunction pager_check_data(e) {\n");
      out.write("\t\t\t//清空分页信息\n");
      out.write("\t\t\t$(\"#page_id\").empty();\n");
      out.write("\t\t\t$(\"#page_id\").append($(\"<strong></strong>\")\n");
      out.write("\t\t\t  .append(\"当前是第\"+e.pageNum+\"页,共\"+e.pages\n");
      out.write("\t\t\t\t\t  +\"页,共\"+e.total+\"条记录\"));\n");
      out.write("\t\t\tcurrentPage = e.pageNum;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t/* 填充分页导航内容  */\n");
      out.write("\t\tfunction nav_check_data(e) {\n");
      out.write("\t\t\t//nav_id\n");
      out.write("\t\t\t$(\"#nav_id\").empty();\n");
      out.write("\t\t\tvar ul = $(\"<ul></ul>\").addClass(\"pagination\"); \n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar headLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"首页\").attr(\"href\", \"#\"));\n");
      out.write("\t\t\tvar previousLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&laquo;\"));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(e.pageNum != 1) {\n");
      out.write("\t\t\t\tul.append(headLi);\n");
      out.write("\t\t\t\tul.append(previousLi);\n");
      out.write("\t\t\t\theadLi.click(function() {\n");
      out.write("\t\t\t\t\tto_check_page(1);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tpreviousLi.click(function() {\n");
      out.write("\t\t\t\t\tto_check_page(e.pageNum - 1);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar nextLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&raquo;\"));\n");
      out.write("\t\t\tvar footLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"尾页\"));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$.each(e.navigatepageNums, function(index, item) {\n");
      out.write("\t\t\t\tvar pageLi = $(\"<li></li>\").append($(\"<a></a>\").append(item));\n");
      out.write("\t\t\t\tul.append(pageLi);\n");
      out.write("\t\t\t\tif(e.pageNum == item) {\n");
      out.write("\t\t\t\t\tpageLi.addClass(\"active\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tpageLi.click(function() {\n");
      out.write("\t\t\t\t\tto_check_page(item);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tif(e.pageNum != e.pages) {\n");
      out.write("\t\t\t\tul.append(nextLi);\n");
      out.write("\t\t\t\tul.append(footLi);\n");
      out.write("\t\t\t\tnextLi.click(function() {\n");
      out.write("\t\t\t\t\tto_check_page(e.pageNum + 1);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tfootLi.click(function() {\n");
      out.write("\t\t\t\t\tto_check_page(e.pages);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tul.appendTo(\"#nav_id\")\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</script>\n");
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
