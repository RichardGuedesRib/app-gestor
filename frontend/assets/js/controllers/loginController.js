const user = new User();
const btnConfirmRegister = document.getElementById("btn-confirm-register");
let dataRegister = document.querySelectorAll(".text-input");

function collectDataRegister() {
  user._firstname = dataRegister[0].value;
  user._lastname = dataRegister[1].value;
  user._phone = dataRegister[2].value;
  user._email = dataRegister[3].value;

  fowardToPassword();
}

function validateRegisterPassword() {
  let getPassword1 = document.getElementById("text-password1");
  let getPassword2 = document.getElementById("text-password2");

  if (getPassword1.value === getPassword2.value) {
    user._password = getPassword1.value;
    console.log("Chamou a Função!");
    registerUser(user);
  } else {
    document.getElementById("msg-register").innerHTML = "Senhas não conferem";
  }
}

function backToRegister() {
  document.getElementById("container-password").classList.add("none");
  document.getElementById("dataForm").classList.remove("none");
}

function fowardToPassword() {
  document.getElementById("container-password").classList.remove("none");
  document.getElementById("dataForm").classList.add("none");
}

function registerUser(user) {
  fetch(gestorConfig.serverAddress + "users", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      firstnameUser: user._firstname,
      lastnameUser: user._lastname,
      emailUser: user._email,
      passwordUser: user._password,
      phoneUser: user._phone,
      isActive: 1,
    }),
  })
    .then((response) => {
      if (!response.ok) {
        throw new Error(`Error Request: ${response.status}`);
      }
      return response.json();
    })
    .then((data) => {
      console.log(data);
    })
    .catch((error) => {
      console.log(error);
    });
}

function checkLogin() {
  let email = document.getElementById("text-email").value;
  let password = document.getElementById("text-password").value;

  fetch(gestorConfig.serverAddress + "login", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      email: email,
      password: password,
    }),
  })
    .then((response) => {
      console.log("Primeiro Then!");

      if (response.ok) {
        window.location.href = "home.html";
      } else if (response.status == 404) {
        document.getElementById("msg-register").textContent =
          "Usuário ou Senha Inválidos";
      } else {
        document.getElementById("msg-register").textContent = response.status;
        throw new Error(`Error Request: ${response.status}`);
      }
      return response.json();
    })
    .then((data) => {
      console.log(data);
    })
    .catch((error) => {
      console.log(error);
    });
}
