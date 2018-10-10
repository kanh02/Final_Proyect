fetch("/api/Game", {
    method: "GET",

}).then(function (response) {

    if (response.ok) {
        return response.json();
    }
    throw new Error(response.statusText);
}).then(function (json) {
     data = json;
        console.log(data);
    PlayerList();

}).then(function () {

}).catch(function (error) {
    console.log("Request failed: " + error.message);
});

function PlayerList() {
    var list = document.getElementById("game");
    for (var i = 0; i < data.length; i++) {

        var Li = document.createElement("li");
        list.appendChild(Li);


        if (data[i].gameplayer[1] != null) {

            Li.textContent = (data[i].gameplayer[0].Player.UserName + " " + "Versus" + " " + data[i].gameplayer[1].Player.UserName);
        } else {
            Li.textContent = (data[i].gameplayer[0].Player.UserName + " " + "Versus" + " " + "You are not Prepared");
        }
        console.log(Li);
    }
}
