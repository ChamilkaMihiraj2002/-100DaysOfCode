document.addEventListener('DOMContentLoaded', function() {
    const loginForm = document.getElementById('log');
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('pwd');
    const emailError = document.getElementById('email-error');
    const passwordError = document.getElementById('pwd-error');
    const togglePasswordButton = document.getElementById('toggle-password');

    function validateEmail(email) {
        const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return re.test(String(email).toLowerCase());
    }

    loginForm.addEventListener('click', function(event) {
        emailError.textContent = '';
        passwordError.textContent = '';

        let isValid = true;

        if (!validateEmail(emailInput.value)) {
            emailError.textContent = 'Please enter a valid email address.';
            isValid = false;
        }

        if (passwordInput.value.length < 6) {
            passwordError.textContent = 'Password must be at least 6 characters long.';
            isValid = false;
        }

        if (!isValid) {
            event.preventDefault();
        }
    });

    togglePasswordButton.addEventListener('click', function() {
        const type = passwordInput.type === 'password' ? 'text' : 'password';
        passwordInput.type = type;
        togglePasswordButton.textContent = type === 'password' ? 'Show' : 'Hide';
    });

    const socialIcons = document.querySelectorAll('.social-icons a img');
    socialIcons.forEach(icon => {
        icon.addEventListener('mouseenter', () => {
            icon.style.transform = 'scale(1.2)';
        });

        icon.addEventListener('mouseleave', () => {
            icon.style.transform = 'scale(1)';
        });
    });
});