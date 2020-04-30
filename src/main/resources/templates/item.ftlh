
<html>
<head>
    <title>Item</title>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="../static/Mainpage.css">
    <link rel="stylesheet" type="text/css" href="../static/item.css">
    <link rel="stylesheet" type="text/css" href="../static/navigation.css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</head>
<body>
<div>
    <nav class="navbar navbar-dark bg-primary">
        <a class="navbar-brand"> <img src="../static/logo.jpg" width="100	" height="100" alt=""></a>
<h1 id="firstHeading" class="firstHeading" lang="ru">
    <b>
    </b>
</h1>
<form id="delete" class="form-inline" method="post" action="/items/${item.id}/delete">
    <input class="btn btn-outline-dark btn-sm"  type="submit" value="Delete">
</form>
<form  id="update" class="form-inline" method="get" action="/items/${item.id}/update">
    <input class="btn btn-outline-dark btn-sm"  type="submit" value="Update">
</form>
</nav>
</div>
<table class="infobox" style="width:25.5em;" data-name="Автомобиль">
    <p align="right">
        <tbody>
        <tr>
            <th colspan="2" class="infobox-above" style="background:#cfe3ff;">
                ${item.car_name}
            </th>
        </tr>
        <tr>
            <th class="plainlist">Power (h.p.)</th>
            <td class="plainlist">
                <a>${item.power}</a>
            </td>
        </tr>
        <tr>
            <th class="plainlist">Weight (kg)</th>
            <td class="plainlist">
                <a>${item.weight}</a>
            </td>
        </tr>
        <tr>
            <th class="plainlist">Maximum speed (km/h)</th>
            <td class="plainlist">
                <a class="mw-redirect" name="max_speed">${item.max_speed}</a>
            </td>
        </tr>
        <tr>
            <th class="plainlist">Waste 100 km/h (l)</th>
            <td class="plainlist">
                <a  name="waste">${item.waste}</a>
            </td>
        </tr>
        <tr>
            <th class="plainlist">Acceleration about 100 km/h (s)</th>
            <td class="plainlist">
                <a name="acceleration">${item.acceleration}</a>
            </td>
        </tr>
        <tr>
            <th class="plainlist">Country</th>
            <td class="plainlist">
                <a  name="country">${item.country}</a>
            </td>
        </tr>
        <tr>
            <th class="plainlist">Body</th>
            <td class="plainlist">
                <a  name="body">${item.body}</a>
            </td>
        </tr>
        </tbody>
    </p>
</table>
<div id="content" name ="content">
    ${item.content}
</div>
<hr>
<div id="comments"  name ="comments">
    <div id="plus">
    <h4>Comments</h4><a href="/items/${item.id}/new-comment">+</a></div>
    <#list comments as comment>
        <div id="comment">
        <a>${comment.content}</a>
        <i><a href="/items/${item.id}/comments/${comment.id}/new-answer"> to answer</a></i>
            <div id="answers">
        <#list answers as answer>
                 <#if answer.commentId == comment.id>
                 <b><a>${answer.content}</a></b>
                 <br>
                 </#if>
        </#list>
            </div>
        </div>
    </#list>
</div>
</body>
</html>
