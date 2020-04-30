function update(){
window.addEventListener("load",function()  {
    let cars = new Array();
    const request = new XMLHttpRequest();
    const url = "/items";
    request.open('GET', url);

    request.setRequestHeader('Content-Type', 'application/json');

    request.addEventListener("readystatechange", () => {
        if (request.readyState === 4 && request.status === 200) {
            console.log(request.responseText);
            // cars.push(document.getElementsByClassName('item'));
            // console.log(cars);
        }
    });
    request.send();
});}