document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('contact-form');

    form.addEventListener('submit', function(event) {
        event.preventDefault(); // Evita el envío del formulario para procesar la validación

        // Obtener los valores del formulario
        const name = document.getElementById('name').value.trim();
        const email = document.getElementById('email').value.trim();
        const message = document.getElementById('message').value.trim();

        // Validación simple
        if (name === '' || email === '' || message === '') {
            alert('Por favor, complete todos los campos.');
            return;
        }

        // Validar el formato del correo electrónico
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            alert('Por favor, ingrese un correo electrónico válido.');
            return;
        }

        // Si todo está bien, muestra un mensaje de éxito
        alert('¡Gracias por contactarnos! Tu mensaje ha sido enviado.');

        // Limpiar el formulario
        form.reset();
    });
});
