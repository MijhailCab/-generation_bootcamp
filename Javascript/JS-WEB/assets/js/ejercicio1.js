const log = document.getElementById('log');

document.addEventListener('keypress', teclapresionada);

function teclapresionada(e) {
  log.textContent += ` ${e.code}`;
}
object.onkeypress = function(){myScript};
// object.addEventListener("keypress", myScript);
