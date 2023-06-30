window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CadastroColabotador = window.blockly.js.blockly.CadastroColabotador || {};
window.blockly.js.blockly.CadastroColabotador.CadastroColaborador = window.blockly.js.blockly.CadastroColabotador.CadastroColaborador || {};

/**
 * @function colaborador
 *
 *
 *
 *
 * @author Paulo Pinto Santana
 * @since 30/06/2023, 02:13:59
 *
 */
window.blockly.js.blockly.CadastroColabotador.CadastroColaborador.colaboradorArgs = [];
window.blockly.js.blockly.CadastroColabotador.CadastroColaborador.colaborador = async function() {

  //
  if (this.cronapi.authentication.isValidSignup('', '', '', '')) {
    //
    this.cronapi.screen.notify('error','Campo Obrigatório');
  } else {
    //
    (await this.cronapi.client('cronapi.screen.post').run("colaborador"));
    //
    this.cronapi.screen.notify('success','Cadastrado Colaborador com sucesso!');
    //
    this.cronapi.screen.changeView("#/home/public/colaboradores",[  ]);
  }
}
