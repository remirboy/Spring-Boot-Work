
<html>
<head>
    <title>List of cars</title>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="../static/logo.css">
    <link rel="stylesheet" type="text/css" href="../static/Mainpage.css">
    <link rel="stylesheet" type="text/css" href="../static/enter.css">
    <link rel="stylesheet"  href="../static/navigation.css">
    <script src="../static/ajax.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
     <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
<#--    <script>-->
<#--        function update(){-->
<#--        window.addEventListener("load",function()  {-->
<#--            let cars = new Array();-->
<#--            const request = new XMLHttpRequest();-->
<#--            const url = "/items";-->
<#--            request.open('GET', url);-->
<#--            console.log('12');-->
<#--            request.setRequestHeader('Content-Type', 'application/json');-->

<#--            request.addEventListener("readystatechange", () => {-->
<#--                if (request.readyState === 4 && request.status === 200) {-->
<#--                    console.log(request.responseText);-->
<#--                    cars.push(document.getElementsByClassName('item'));-->
<#--                    console.log(cars);-->
<#--                }-->
<#--            });-->
<#--            request.send();-->
<#--        });}</script>-->
</head>
<body>
<div>
    <nav class="navbar navbar-dark bg-primary">
    <a class="navbar-brand"> <img src="/../static/logo.jpg" width="100	" height="100" alt=""></a>
    <div id="auth">
</div>
</nav>
</div>
<div id="main">
    <h5>Items in AUTOFAN. The first item in list are more new.</h5> <button onclick="update()">&#x21bb;</button>
    <div id="collection">
    <#list items as item>
        <a class="item" href="/items/${item.id}">${item.car_name}</a><span>, </span>
    </#list>
    </div>
</div>
</body>
</html>
