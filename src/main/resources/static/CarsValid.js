function valid(form){
    var fail=false;
    var power = form.power.value;
    var weight = form.weight.value;
    var max_speed = form.max_speed.value;
    var waste = form.waste.value;
    var acceleration = form.acceleration.value;
    if (power===' '||weight===' '||max_speed===' '|| waste === ' ' || acceleration === ' ') {
        fail="Put correct data";
    }
    if (fail) {
        alert(fail);
    }
}