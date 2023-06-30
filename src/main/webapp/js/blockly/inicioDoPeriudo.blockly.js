window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.InicioDoPeriudo = window.blockly.js.blockly.InicioDoPeriudo || {};

/**
 * @function inicioDoPeriudo
 *
 *
 *
 *
 * @author Paulo Pinto Santana
 * @since 20/06/2023, 10:27:28
 *
 */
window.blockly.js.blockly.InicioDoPeriudo.inicioDoPeriudoArgs = [];
window.blockly.js.blockly.InicioDoPeriudo.inicioDoPeriudo = async function() {

  //
  (await this.cronapi.client('cronapi.calendar.setCalendarSelectDates').run("", this.cronapi.dateTime.newDate(0, 0, 0, 0, 0, 0)));
}
