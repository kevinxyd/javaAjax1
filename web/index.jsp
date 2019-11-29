<%--
  Created by IntelliJ IDEA.
  User: FTKJ
  Date: 2019/11/28
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="static/js/jquery-3.3.1.js"></script>
  </head>

  <script>
    $(function () {
      function ajaxSelect(selector,url,value){
        $.ajax({
          url: url,
          type: "get",
          data: {id:value},
          dataType: "json",
          success: function (data) {
            $(selector).empty();
            var html = '<option value="-1">请选择</option>';
            data.forEach(function (value,index,event) {
              html = html + '<option value="' + event[index].id + '">' + event[index].area + '</option>';
            })

            $(selector).append(html);
          }
        });
      }
      //省
      ajaxSelect("#province","/province","");
      //市
      $("#province").change(function () {
        var id = $("#province option:selected").val();
        if(id==-1){
          $("#city").empty();
          return;
        }
        ajaxSelect("#city","/city",id);
      });

      $("#city").change(function () {
        var id = $("#city option:selected").val();
        if(id==-1){
          $("#region").empty();
          return;
        }
        ajaxSelect("#region","/qu",id);
      });
    });
  </script>
  <body>
  请选择省: <select id="province">

  </select><br><br>
  请选择市：<select id="city">

  </select><br><br>

  请选择区：<select id="region">

  </select>

  </body>
</html>
