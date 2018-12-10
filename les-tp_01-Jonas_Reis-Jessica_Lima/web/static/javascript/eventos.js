/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var num=0;
function mensagem(){   
    window.alert("Olá!Você clicou "+num+" vezes");
    num++;
}

window.onload = function(){ 
    //lblLogin = document.getElementById('login');
    btnLogin = document.getElementById('btnLogin');
    btnLogin.addEventListener('click', function(){mensagem('btnLogin');}, false);
    
};
/*
lblLogin.onload= function (){
    btnLogin = document.getElementById('btnLogin');
    btnLogin.addEventListener('click', function(){mensagem();}, false);
};*/



