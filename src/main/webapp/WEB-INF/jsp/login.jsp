<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<html>
<head>
    <title>登录</title>
    <base href="<%=basePath %>" />
    <link rel="stylesheet" href="static/layui/css/layui.css">


</head>
<body>
    <!-- 你的HTML代码 -->
    <form class="layui-form" action="user/login" method="post" >
        <div class="layui-form-item">
            <span>用户名：</span><input  type="text" name="username"/><br/>
            <span>密&nbsp;码：</span><input type="text" name="password"/><br/>
            <span class="default-color4">${errorMsg}</span><br>
            <!--需要加上lay-submit=""，否则监听提交事件不生效; 增加type="button"的目的是解决form表单中出现button，导致弹出层闪退问题-->
            <button type="submit" lay-filter="sub" lay-submit="" class="layui-btn layui-btn-normal">登录</button>
        </div>
    </form>

</body>
</html>
