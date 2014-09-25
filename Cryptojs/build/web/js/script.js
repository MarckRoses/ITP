/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function saluda()
{
    alert("Saluda!!!");
}

/*metodo de hash sha3 Cryptojs*/

function hash()
{
    var pass = document.getElementById("pass");
    //pass.value = "uhdyuydgujdy";
    var sha3 = CryptoJS.SHA3(pass.value,{outputLenght: 512});
    document.getElementById("pass").value = sha3;
    alert(sha3);
}




 








