fetch("https://api.Games", {

    method: "GET",

}).then(function (response) {

    if (response.ok) {
        return response.json();
    }
    throw new Error(response.statusText);
}).then(function (json) {
    data = json
    console.log(data);


}).then(function () {

}).catch(function (error) {
    console.log("Request failed: " + error.message);
});
