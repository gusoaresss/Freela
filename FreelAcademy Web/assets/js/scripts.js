/* ARQUIVO: assets/js/scripts.js */

document.addEventListener('DOMContentLoaded', () => {
    
    // --- LÓGICA DA SIDEBAR (PAINEL) ---
    const toggleBtn = document.getElementById('sidebarToggle');
    const sidebar = document.getElementById('sidebar');
    const mainContent = document.getElementById('mainContent');

    // Verifica se os elementos existem na página antes de tentar usar
    // (Isso evita erros quando você estiver na Home ou Login, que não têm sidebar)
    if (toggleBtn && sidebar && mainContent) {
        toggleBtn.addEventListener('click', () => {
            sidebar.classList.toggle('collapsed');
            mainContent.classList.toggle('expanded');
        });
    }

});