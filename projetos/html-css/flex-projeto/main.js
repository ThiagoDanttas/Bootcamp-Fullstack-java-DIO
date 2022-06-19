function navbarToggle(elemento) {
  const nav = document.querySelector("nav");
  document.addEventListener("click", (e) => {
    const el = e.target;

    if (el.classList.contains("fa-bars")) {
      nav.classList.add(elemento);
    }

    if (el.classList.contains("fa-xmark")) {
      nav.classList.remove(elemento);
    }
  });
}

navbarToggle("nav-active");
