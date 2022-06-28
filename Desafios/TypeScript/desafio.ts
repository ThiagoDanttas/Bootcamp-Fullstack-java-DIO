/**--=============== Desafio 1 ===============-- **/
interface Employee {
  name: string;
  code: number;
}

const john: Employee = {
  name: " John",
  code: 10,
};

/**--=============== Desafio 2 ===============-- **/

enum Profissao {
  Atriz,
  Padeiro,
}

interface Pessoa {
  nome: string;
  idade: number;
  profissao;
}

let pessoa1: Pessoa = {
  nome: "maria",
  idade: 29,
  profissao: Profissao.Atriz,
};

let pessoa3: Pessoa = {
  nome: "laura",
  idade: 32,
  profissao: Profissao.Atriz,
};

let pessoa4: Pessoa = {
  nome: "carlos",
  idade: 19,
  profissao: Profissao.Padeiro,
};

/**--=============== Desafio 3 ===============-- **/

let botaoAtualizar = document.getElementById(
  "atualizar-saldo"
) as HTMLButtonElement;
let botaoLimpar = document.getElementById("limpar-saldo")!;
let soma = document.getElementById("soma") as HTMLInputElement;
let campoSaldo = document.getElementById("campo-saldo") as HTMLSpanElement;

limparSaldo();

function somarAoSaldo(soma: number) {
  let total = 0;
  total += soma;
  campoSaldo.innerHTML += total.toString();
}

function limparSaldo() {
  campoSaldo.innerHTML = "";
  soma.value = "";
}

botaoAtualizar.addEventListener("click", () => {
  somarAoSaldo(Number(soma.value));
});

botaoLimpar.addEventListener("click", limparSaldo);

/**
      <h4>Valor a ser adicionado: <input id="soma"> </h4>
      <button id="atualizar-saldo">Atualizar saldo</button>
      <button id="limpar-saldo">Limpar seu saldo</button>
      <h1>"Seu saldo é: " <span id="campo-saldo"></span></h1>
   */
