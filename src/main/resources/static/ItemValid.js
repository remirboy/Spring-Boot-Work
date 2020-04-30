function valid(form){
    var fail=false;
    var item = form.item.value;
    if (item==' ') {
        fail="Enter text about car";
    }
    if (fail) {
        alert(fail);
    }
}