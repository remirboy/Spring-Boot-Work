<html>
<head>
    <title>AUTO_FAN</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../static/Mainpage.css">
    <link rel="stylesheet" type="text/css" href="../static/navigation.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
</head>
<body>
<div>
    <nav class="navbar navbar-dark bg-primary">
        <a class="navbar-brand"> <img src="../static/logo.jpg" width="100	" height="100" alt=""></a>
        <div id="auth">
            <#if !authentication??>
           <form class="form-inline">
               <button class="btn btn-outline-dark btn-sm" type="button"><a href="/signUp">Sign up</a></button>
               <button class="btn btn-outline-dark btn-sm" type="button"><a href="/signIn">Log In</a></button>
           </form>
            </#if>
            <#if authentication??>
            <#if authentication.isAuthenticated()>
                <form class="form-inline">
                    <button class="btn btn-outline-dark btn-sm" type="button"><a href="/logout">Log Out</a></button>
                </form>
            </#if>
            </#if>
        </div>
    </nav>
</div>
<div class="main">
    <div id="navigation" align="left">
        Navigation:
       <ul>
        <li> <a href="/items" target="_blank">Items List</a></li>
        <li> <a href="/items/new-item" target="_blank">Item Enter</a></li>
    </ul>
    </div>
    <div id="main">
        <a  class="title">Are you like cars?Then you're at the right place. Here you can find information about cars. You can search them by manufacturer, by class. You can write an interesting article on automotive topics, send a photo of an unusual car. You can comment on the articles of other users, correct their errors, inaccuracies.
            <li>Rules:<ul>Don't be rude</ul><ul>Do not insult cars and their manufacturers</ul><ul>Do not use profanity</ul><ul>To write correctly</ul><ul>Criticism should be constructive</ul></li>
            For violation of the rules ban
        </a>
    </div>

    <div id="Author">
        <h2>Where find<abbr title="Remir Ziatdinov"><a href="#Author"> the author </a></abbr></h2>
        <p><a href="file:///C:/Users/Ремир/Desktop/Папка/Универ/ИКТ/HTML/Image.html" target="_blank" class="href">Photo of author</a></p><p><a href="mailto:remirboy@yandex.ru" target="_blank" class="href">Почта</a></p>
        <p><a href="https://vk.com/rmr_z" target="_blank" class="href">VK</a></p>
        <p ><a href="https://www.instagram.com/remirka_ziatdinov/" class="href">Instagram</a></p>
        <address class="address"><big>Russia,Tatarstan,Kazan</big> </address>
    </div>
</div>

</body>
</html>
