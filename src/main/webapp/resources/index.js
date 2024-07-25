/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 */


/* global PF, PrimeFaces */

//gera o auto filtro
function filterTable() {
    if (PF('alunoTableWidget')) {
        PF('alunoTableWidget').filter();
    }
}




//calcular IMC
function calcularIMC() {

    let peso = parseFloat(document.getElementById('formCadastroAluno:peso').value);
    let altura = parseFloat(document.getElementById('formCadastroAluno:altura').value) / 100;
  
    console.log(`$Peso ${peso} altura ${altura}` );
    
    if (peso > 0 && altura > 0) {
        
        let imc = peso / (altura * altura);
        
        document.getElementById('formCadastroAluno:imc').textContent = imc.toFixed(2);
    console.log("imc" + imc);

        // Classificação do IMC
        var classificacao = "calculando";

        switch (true) {
            case (imc < 18.5):
                classificacao = "Baixo peso";
                break;
            case (imc < 24.9):
                classificacao = "Peso normal";
                break;
            case (imc < 29.9):
                classificacao = "Sobrepeso";
                break;
            case (imc < 34.9):
                classificacao = "Obesidade grau I";
                break;
            case (imc < 39.9):
                classificacao = "Obesidade grau II";
                break;
            default:
                classificacao = "Obesidade grau III";
        }

       
       document.getElementById('formCadastroAluno:classificacaoImc').textContent = classificacao;
    }
}