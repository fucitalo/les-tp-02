/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$( document ).ready(function() {
    $(document).on('click', '#inicio', function(){
    var botaoDinamico = document.createElement("BUTTON");       
    var label = document.createTextNode("Dinamico");
    botaoDinamico.appendChild(label);
    document.body.appendChild(botaoDinamico);
    });
});
