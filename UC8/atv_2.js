let lista = []
let opcao = 's'

while (opcao == 's')
{
    let nome = prompt("Digite o nome do participante: ")
    let idade = prompt("Diite a idade do participante: ")
    if(idade >= 18){
        if(lista.length < 100){
            alert("Cadastro realizado com sucesso!")
            lista.push(nome)
        }
        else{
            alert("Cadastro não permitido, pois a lista esta cheia.")
        }
    }
    else{
        alert("Cadastro não permitido, participante menor que 18 anos.")
    }
opcao = prompt("Deseja cadastrar outro participante? (s ou n)")    
}

console.log(lista)
alert(lista)