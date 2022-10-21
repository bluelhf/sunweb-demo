let update = () => {
    let element = document.getElementById("prefill-time");
    element.innerText = (new Date()).toLocaleString("lv-LV");
};

document.addEventListener("DOMContentLoaded", update);
setInterval(update, 1000);

document.addEventListener("DOMContentLoaded", () => {
    fetch(window.location.origin + "/api/potato")
        .then((response) => response.text())
        .then((data) => {
            document.getElementById("potato-counter")
                .innerText = data;
        });
});