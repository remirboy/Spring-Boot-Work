<html>
<head>
    <title>Item's creation</title>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
    <link rel="stylesheet" type="text/css" href="../static/logo.css">
    <link rel="stylesheet" type="text/css" href="../static/Mainpage.css">
    <link rel="stylesheet" type="text/css" href="../static/enter.css">
    <script type="text/javascript" src="../static/CarsValid.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <meta http-equiv="Content-Type" content="text/html" charset="utf-8">
</head>
<body>
<div id="nav">
    <nav class="navbar navbar-dark bg-primary">
        <a class="navbar-brand"> <img src="../static/logo.jpg" width="100	" height="100" alt=""></a>
        <div id="auth">

        </div>
    </nav>
</div>
<div class="input-group">
    <form method="post" action="/items/${item.id}/update" name="item" id="item" >
        <table class="infobox" style="width:25.5em;" data-name="Автомобиль">
            <p align="right">
                <tr>
                    <th colspan="2" class="infobox-above" style="background:#cfe3ff;">Название автомобиля<p><input type="text" value="${item.car_name}" name="car_name"></p></th>
            </tr>
            <tr>
                <th class="plainlist">Power (h.p.)</th>
                <td class="plainlist">
                    <p><input type="text" value="${item.power}" name="power"></p>
                </td>
            </tr>
            <tr>
                <th class="plainlist">Weight (kg)</th>
                <td class="plainlist">
                    <p><input type="text" value="${item.weight}" name="weight"></p>
                </td>
            </tr>
            <tr>
                <th class="plainlist">Maximum speed (km/h)</th>
                <td class="plainlist">
                    <p><input type="text" value="${item.max_speed}" name="max_speed"></p>
                </td>
            </tr>
            <tr>
                <th class="plainlist">Waste 100 km/h (l)</th>
                <td class="plainlist">
                    <p><input type="text" value="${item.waste}" name="waste"></p>
                </td>
            </tr>
            <tr>
                <th class="plainlist">Acceleration about 100 km/h (s)</th>
                <td class="plainlist">
                    <p><input type="text" value="${item.acceleration}" name="acceleration"></p>
                </td>
            </tr>
            <tr>
                <th class="plainlist" >Country</th>
                <td class="plainlist">
                    <p>
                        <select name="country">
                            <option name="country">France</option>
                            <option name="country">USA</option>
                            <option name="country">Russia</option>
                            <option name="country">Japan</option>
                            <option name="country">German</option>
                        </select></p>
                </td>
            </tr>
            <tr>
                <th class="plainlist">Bodywork</th>
                <td class="plainlist">
                    <p>
                        <select name="body" >
                            <option name="body">Sedan</option>
                            <option name="body">Wagon</option>
                            <option name="body">Hatchback</option>
                            <option name="body">Сoupe</option>
                            <option name="body">Cabrio</option>
                        </select></p>
                </td>
            </tr>
        </table>
        <div id="content">
            <p><b>Write about auto here:</b></p>
            <textarea cols="100" name="content"> </textarea>
            <div class="btn-group" role="group" arealabel="Basic">
                <input type="submit" class="navbar navbar-dark bg-primary"  onclick="valid(document.getElementById('item'))" >Save item
            </div>
        </div>
    </form>
</div>
</body>
</html>

















