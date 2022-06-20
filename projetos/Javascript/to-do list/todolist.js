function todoList() {
  let inputTxt = document.querySelector("input");
  let btn = document.querySelector(".btnSub");
  let ulList = document.querySelector("ul.list-group");

  // Função para criar elementos para o to-do list

  function createElements() {
    // criando elementos
    let li = document.createElement("li");
    let input = document.createElement("input");
    let span = document.createElement("span");

    // Setando atributos
    li.setAttribute("class", "list-item");
    input.type = "checkbox";
    input.setAttribute("class", "check");
    span.setAttribute("class", "tarefa");

    // adcionando o valor do input text dentro do span
    span.innerHTML = inputTxt.value;

    // adcionando elementos dentro do li
    li.appendChild(input);
    li.appendChild(span);

    // Adciona a tag li dentro da ul
    ulList.appendChild(li);

    // limpa o input
    inputTxt.value = "";
    // Mantem o cursos dentro do input text
    inputTxt.focus();
  }

  function validInput() {
    // evento click
    btn.addEventListener("click", () => {
      if (!inputTxt.value) {
        alert("Insira uma tarefa!");
      } else {
        createElements();
      }
    });
  }
  validInput();
}

todoList();
