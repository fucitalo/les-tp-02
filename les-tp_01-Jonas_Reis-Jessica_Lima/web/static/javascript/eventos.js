/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function mudarCor(id){   
    window.alert("Você clicou em: " + id.toString());
}

window.onload = function(){ 
    btnLogin = document.getElementById('btnLogin');
    btnLogin.addEventListener('click', function(){mudarCor('btnLogin');}, false);
};


