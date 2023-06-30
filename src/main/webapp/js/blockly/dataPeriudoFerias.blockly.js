window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.DataPeriudoFerias = window.blockly.js.blockly.DataPeriudoFerias || {};

/**
 * @function dataPeriudoFerias
 *
 *
 *
 *
 * @author Paulo Pinto Santana
 * @since 20/06/2023, 10:09:35
 *
 */
window.blockly.js.blockly.DataPeriudoFerias.dataPeriudoFeriasArgs = [];
window.blockly.js.blockly.DataPeriudoFerias.dataPeriudoFerias = async function() {

  //
  this.cronapi.screen.changeValueOfField("", this.cronapi.dateTime.newDate(2000, 9, 25, 10, 0, 0));
  return this.cronapi.dateTime.incDay(null, 10);
}
