window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.MutualAuth = window.blockly.js.blockly.MutualAuth || {};

/**
 * @function login
 *
 * MutualAuth
 *
 *
 * @author Paulo Pinto Santana
 * @since 21/06/2023, 14:32:50
 *
 */
window.blockly.js.blockly.MutualAuth.loginArgs = [];
window.blockly.js.blockly.MutualAuth.login = async function() {

  //
  (await this.cronapi.client('cronapi.authentication.mutualLogin').run());
}

/**
 * @function signup
 *
 * Descreva esta função...
 *
 *
 * @author Paulo Pinto Santana
 * @since 21/06/2023, 14:32:50
 *
 */
window.blockly.js.blockly.MutualAuth.signupArgs = [];
window.blockly.js.blockly.MutualAuth.signup = async function() {

  //
  (await this.cronapi.client('cronapi.authentication.mutualSignup').run());
}
