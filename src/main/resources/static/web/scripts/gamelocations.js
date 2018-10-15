var gamePlayerID;

    function getParameterByName(name) {
        var match = RegExp('[?&]' + name + '=([^&]*)').exec(window.location.search);
        return match && decodeURIComponent(match[1].replace(/\+/g, ' '));
    }

    function makeUrl() {
        gamePlayerID = getParameterByName("gp");
        return '/api/Game_view/' + gamePlayerID;
    }

            fetch(makeUrl())
                .then(function(response) {
                    return response.json();
                })
                .then(function(json) {
                    var data = json;
                    console.log(data);
                    Table();
                })
                .catch(function(error) {
                    console.log('Request failed', error)
                });


    function Table() {

        var table = document.getElementById("grids");
        var tbody= document.createElement("tbody")
        var alfabetic = ["","A","B","C","D","E","F","G","H","I","J"];
        var numeric =["1","2","3","4","5","6","7","8","9","10"];
        var column,row,column1;

        for(var i =0; i<11;i++){
             row = document.createElement("tr");
             column1=document.createElement("td");
           column1.textContent=alfabetic[i];
            row.appendChild(column1);
            tbody.appendChild(row);

            for(j=0;j<10;j++){
                column =document.createElement("td");
                column.textContent=numeric[j];
                row.appendChild(column);
                tbody.appendChild(row);
            }
            

        }

        table.appendChild(tbody);
    }

