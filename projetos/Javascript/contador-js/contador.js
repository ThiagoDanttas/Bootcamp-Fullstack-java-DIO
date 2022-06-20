function count() {
  let cont = document.querySelector("#cont");
  let countNumber = 0;

  document.querySelector("span#increment").addEventListener("click", () => {
    if (countNumber < 10) {
      countNumber += 1;
    }
    cont.innerHTML = countNumber;
  });

  document.querySelector("span#decrement").addEventListener("click", () => {
    if (countNumber > 0) {
      countNumber -= 1;
    }
    cont.innerHTML = countNumber;
  });
}

count();
