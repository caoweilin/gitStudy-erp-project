/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-02 06:21:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wageManage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>薪资信息</title>\n");
 
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
      out.write("\n");
      out.write("\t<!-- 流程状态模态框 -->\n");
      out.write("\t<div class=\"modal fade\" id=\"wage_state_modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("\t  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t    <div class=\"modal-content\">\n");
      out.write("\t      <div class=\"modal-header\">\n");
      out.write("\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t        <h4 class=\"modal-title\" id=\"span_state\">流程状态</h4>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-body\">\n");
      out.write("\t        <table class=\"table table-bordered\" id=\"table_flow_id\">\n");
      out.write("\t\t        <thead>\n");
      out.write("\t\t            <tr>\n");
      out.write("\t            \t  <th>任务号</th>\n");
      out.write("\t\t\t\t\t  <th>流程号</th>\n");
      out.write("\t\t\t\t\t  <th>节点内容</th>\n");
      out.write("\t\t\t\t\t  <th>执行人</th>\n");
      out.write("\t\t\t\t      <th>创建时间</th>\n");
      out.write("\t\t            </tr>\n");
      out.write("\t\t        </thead>\n");
      out.write("\t\t        <tbody>\n");
      out.write("\t\t        </tbody>\n");
      out.write("\t\t    </table>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-footer\">\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-primary modal_btn_invite_cancel\" data-dismiss=\"modal\">确定</button>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- 回复复议模态框 -->\n");
      out.write("\t<div class=\"modal fade\" id=\"add_reConsider_modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("\t  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("\t    <div class=\"modal-content\">\n");
      out.write("\t      <div class=\"modal-header\">\n");
      out.write("\t        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t        <h4 class=\"modal-title\" id=\"myModalLabel\">审批</h4>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-body\">\n");
      out.write("\t        <form class=\"form-horizontal\" method=\"post\" id=\"update_wage_form\">\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t   <label for=\"inputEmail3\" class=\"col-sm-2 control-label\">审批内容</label>\n");
      out.write("\t\t\t   <div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t   <textarea type=\"text\" class=\"form-control\" name=\"adminDescript\"  id=\"reason_add_id\"></textarea>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"modal-footer\">\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-default \" data-dismiss=\"modal\">关闭</button>\n");
      out.write("\t        <button type=\"button\" class=\"btn btn-primary\" id=\"add_reConsider_sure\">确定</button>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
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
      out.write("\t\t\t\t\t    \t<h1 class=\"col-md-5\">薪资复议</h1>\n");
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
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\" id=\"btn_allwage\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"模拟结算\">薪资结算</button>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    <table class=\"table table-bordered\" id=\"table_id\">\n");
      out.write("\t\t\t\t\t        <thead>\n");
      out.write("\t\t\t\t\t            <tr>\n");
      out.write("\t\t\t\t\t            \t<th>序号</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>年份</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>月份</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>姓名</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>岗位</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>基本工资</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>绩效工资</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>加班工资</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>奖惩金</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>社保</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>总工资</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>复议内容</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>流程状态</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>审批</th>\n");
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
      out.write("\t\t//给查询按钮添加年份月份\n");
      out.write("\t\tfill_check_year();\n");
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
      out.write("/wage/getReConsiderWage/\"+pn,\n");
      out.write("\t\t\t\ttype : \"GET\",\n");
      out.write("\t\t\t\tsuccess : function(e) {\n");
      out.write("\t\t\t\t\tif(e) {\n");
      out.write("\t\t\t\t\t\tvar e = e.map.pageInfo;\n");
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
      out.write("\t\t\t\tvar wageIdTd = $(\"<td></td>\").append(item.wageId);\n");
      out.write("\t\t\t\tvar yearsTd = $(\"<td></td>\").append(item.years);\n");
      out.write("\t\t\t\tvar monthsTd = $(\"<td></td>\").append(item.months);\n");
      out.write("\t\t\t\tvar nameTd = $(\"<td></td>\").append(item.user.userName);\n");
      out.write("\t\t\t\tvar jobPositionTd = $(\"<td></td>\").append(find_deptAndPost(item.user.parentId));\n");
      out.write("\t\t\t\tvar baseWageTd = $(\"<td></td>\").append(item.baseWage);\n");
      out.write("\t\t\t\tvar perfWageTd = $(\"<td></td>\").append(item.perfWage);\n");
      out.write("\t\t\t\tvar ovWageTd = $(\"<td></td>\").append(item.ovWage);\n");
      out.write("\t\t\t\tvar rapWageTd = $(\"<td></td>\").append(item.rapWage);\n");
      out.write("\t\t\t\tvar jinpoWageTd = $(\"<td></td>\").append(item.jinpoWage);\n");
      out.write("\t\t\t\tvar totalWageTd = $(\"<td></td>\").append(item.totalWage);\n");
      out.write("\t\t\t\tif(item.state == 1) {\n");
      out.write("\t\t\t\t\tvar descriptTd = $(\"<td></td>\").append(item.descript);\n");
      out.write("\t\t\t\t\t//复议按钮\n");
      out.write("\t\t\t\t\tvar reConsiderBtn = $(\"<button></button>\").addClass(\"btn btn-danger btn-sm btn_wage_reConsider\")\n");
      out.write("\t\t\t\t\t.append($(\"<span></span>\").addClass(\"glyphicon glyphicon-tags\")).append(\" \").append(\"审批\");\n");
      out.write("\t\t\t\t\treConsiderBtn.attr(\"wage_id\", item.wageId);\n");
      out.write("\t\t\t\t\tvar considerTd = $(\"<td></td>\").append(reConsiderBtn);\n");
      out.write("\t\t\t\t}else if(item.state == 2) {\n");
      out.write("\t\t\t\t\tvar descriptTd = $(\"<td></td>\").append(item.descript);\n");
      out.write("\t\t\t\t\t//复议按钮\n");
      out.write("\t\t\t\t\tvar reConsiderBtn = $(\"<button></button>\").addClass(\"btn btn-danger btn-sm btn_wage_reConsider\")\n");
      out.write("\t\t\t\t\t.append($(\"<span></span>\").addClass(\"glyphicon glyphicon-tags\")).append(\" \").append(\"已审批\");\n");
      out.write("\t\t\t\t\treConsiderBtn.attr(\"wage_id\", item.wageId).attr(\"disabled\", true);\n");
      out.write("\t\t\t\t\tvar considerTd = $(\"<td></td>\").append(reConsiderBtn);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t//状态按钮\n");
      out.write("\t\t\t\tvar stateBtn = $(\"<button></button>\").addClass(\"btn btn-warning btn-sm btn_state_job\")\n");
      out.write("\t\t\t\t.append($(\"<span></span>\").addClass(\"glyphicon glyphicon-stats\")).append(\"状态\");\n");
      out.write("\t\t\t\tstateBtn.attr(\"wage_id\", item.wageId);\n");
      out.write("\t\t\t\tvar chanstate = $(\"<td></td>\").append(stateBtn);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t/* 加到表格下的<tbody>里面  */\n");
      out.write("\t\t\t\t$(\"<tr></tr>\").append(wageIdTd).append(yearsTd).append(monthsTd)\n");
      out.write("\t\t\t\t.append(nameTd).append(jobPositionTd).append(baseWageTd).append(perfWageTd)\n");
      out.write("\t\t\t\t.append(ovWageTd).append(rapWageTd).append(jinpoWageTd)\n");
      out.write("\t\t\t\t.append(totalWageTd).append(descriptTd).append(chanstate).append(considerTd)\n");
      out.write("\t\t\t\t.appendTo(\"#table_id tbody\")\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t//根据职位id找到对应部门以及职位\n");
      out.write("\t\tfunction find_deptAndPost(id) {\n");
      out.write("\t\t\tvar deptName='';\n");
      out.write("\t\t\tvar postName='';\n");
      out.write("\t\t\tif(id != 0) {\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/deptPost/getDmptByPId\",\n");
      out.write("\t\t\t\t\ttype : \"GET\",\n");
      out.write("\t\t\t\t\tdata : \"id=\"+id,\n");
      out.write("\t\t\t\t\tasync:false,\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\tdeptName = data.map.list.deptName;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/deptPost/getPostById\",\n");
      out.write("\t\t\t\t\ttype : \"GET\",\n");
      out.write("\t\t\t\t\tdata : \"id=\"+id,\n");
      out.write("\t\t\t\t\tasync:false,\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\tpostName = data.map.list.postName;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar data = deptName + \" - \" + postName;\n");
      out.write("\t\t\tconsole.log(data);\n");
      out.write("\t\t\treturn data;\n");
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
      out.write("\t\t//点击复议按钮\n");
      out.write("\t\t$(document).on(\"click\", \".btn_wage_reConsider\", function() {\n");
      out.write("\t\t\t//给复议确认按钮添加id\n");
      out.write("\t\t\t$(\"#add_reConsider_sure\").attr(\"wage_id\", $(this).attr(\"wage_id\"));\n");
      out.write("\t\t\t//弹出复议模态框\n");
      out.write("\t\t\t$(\"#add_reConsider_modal\").modal({\n");
      out.write("\t\t\t\tbackdrop : 'static'\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//点击复议模态框中的确认按钮\n");
      out.write("\t\t$(\"#add_reConsider_sure\").click(function() {\n");
      out.write("\t\t\tif($(\"#reason_add_id\").val() == '') {\n");
      out.write("\t\t\t\talert(\"请填写复议内容\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/wage/updateAdminWage/\"+$(this).attr(\"wage_id\"),\n");
      out.write("\t\t\t\tdata : $(\"#update_wage_form\").serialize(),\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tif(data) {\n");
      out.write("\t\t\t\t\t\talert(\"提交成功！\");\n");
      out.write("\t\t\t\t\t\t//关闭模态框\n");
      out.write("\t\t\t\t\t\t$(\"#add_reConsider_modal\").modal('hide');\n");
      out.write("\t\t\t\t\t\t//跳到当前页面\n");
      out.write("\t\t\t\t\t\tto_page(currentPage);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//======================================流程状态==========================================================\n");
      out.write("\t\t$(document).on(\"click\", \".btn_state_job\", function() {\n");
      out.write("\t\t\t//状态数据填充\n");
      out.write("\t\t\tfill_state_info($(this).attr(\"wage_id\"));\n");
      out.write("\t\t\t//弹出模态框\n");
      out.write("\t\t\t$(\"#wage_state_modal\").modal({\n");
      out.write("\t\t\t\tbackdrop : \"static\"\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\n");
      out.write("\t\t//填充数据\n");
      out.write("\t\tfunction fill_state_info(wage_id) {\n");
      out.write("\t\t\t$(\"#table_flow_id tbody\").empty();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/wageFlow/getFlowData/\"+wage_id,\n");
      out.write("\t\t\t\ttype : \"GET\",\n");
      out.write("\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\tif(data) {\n");
      out.write("\t\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\t\tvar list = data.map.wfList;\n");
      out.write("\t\t\t\t\t\t$.each(list, function(index, item) {\n");
      out.write("\t\t\t\t\t\t\tvar stateTd = $(\"<td></td>\").append(item.flowId);\n");
      out.write("\t\t\t\t\t\t\tvar resumeIdTd = $(\"<td></td>\").append(item.wageId);\n");
      out.write("\t\t\t\t\t\t\tvar contentTd = $(\"<td></td>\").append(item.content);\n");
      out.write("\t\t\t\t\t\t\tvar operatorNowTd = $(\"<td></td>\").append(item.operatorNow);\n");
      out.write("\t\t\t\t\t\t\tvar createTimeTd = $(\"<td></td>\").append(item.createTime);\n");
      out.write("\t\t\t\t\t\t\t$(\"<tr></tr>\").append(stateTd).append(resumeIdTd).append(contentTd)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  .append(operatorNowTd).append(createTimeTd)\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  .appendTo(\"#table_flow_id tbody\");\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t}\t\n");
      out.write("\t\n");
      out.write("\t//=====================================薪资结算======================================================\n");
      out.write("\t$(\"#btn_allwage\").click(function() {\n");
      out.write("\t\t//请求结算工资\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/wage/wageSettlement\",\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tif(data) {\n");
      out.write("\t\t\t\t\tconsole.log(\"^-^\")\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tif(data.code = 200) {\n");
      out.write("\t\t\t\t\t\talert(\"上月工资已经结算！\");\n");
      out.write("\t\t\t\t\t}else if(data.code = 100){\n");
      out.write("\t\t\t\t\t\talert(\"工资结算完成！\")\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\t\n");
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
      out.write("\t\t\n");
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
