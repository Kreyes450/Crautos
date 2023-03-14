const signupForm = document.getElementById('signup-form');
const confirmPopup = document.getElementById('confirm-popup');
const confirmPopupBtn = document.getElementById('confirm-popup-btn');
const loginBtn = document.getElementById('login-btn');
const password = document.getElementById('password');
const passwordConfirm = document.getElementById('password-confirm');

signupForm.addEventListener('submit', (e) => {
    e.preventDefault();
    if (password.value !== passwordConfirm.value) {
        alert('Las contraseñas no coinciden. Por favor, inténtelo de nuevo.');
        password.value = '';
        passwordConfirm.value = '';
        password.focus();
    } else {
        confirmPopup.style.display = 'block';
    }
});

confirmPopupBtn.addEventListener('click', () => {
    window.location.href = 'home.html';
});

loginBtn.addEventListener('click', () => {
    window.location.href = 'login.html';
});
