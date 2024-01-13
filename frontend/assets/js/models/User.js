class User {
  constructor(firstname, lastname, email, password, phone) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.password = password;
    this.phone = phone;
  }
  get firstname() {
    return this.firstname;
  }
  set firstname(value) {
    this._firstname = value;
  }
  get lastname() {
    return this.lastname;
  }
  set lastname(value) {
    this._lastname = value;
  }
  get email() {
    return this.email;
  }
  set email(value) {
    this._email = value;
  }
  get password() {
    return this.password;
  }
  set password(value) {
    this._password;
  }
  get phone() {
    return this.phone;
  }
  set phone(value) {
    this._phone = value;
  }
}


