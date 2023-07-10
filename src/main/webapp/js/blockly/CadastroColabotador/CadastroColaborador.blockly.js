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
 * @param nomeFuncionario
 * @param email
 * @param senha
 * @param confirmarSenha
 *
 * @author Paulo Pinto Santana
 * @since 09/07/2023, 22:06:22
 *
 */
window.blockly.js.blockly.CadastroColabotador.CadastroColaborador.colaboradorArgs = [{ description: 'nomeFuncionario', id: '5eccc871' }, { description: 'email', id: 'c75cae64' }, { description: 'senha', id: '946c508a' }, { description: 'confirmarSenha', id: '8f515ac8' }];
window.blockly.js.blockly.CadastroColabotador.CadastroColaborador.colaborador = async function(nomeFuncionario, email, senha, confirmarSenha) {
 var item;
  //
  item = this.cronapi.authentication.isValidSignup(nomeFuncionario, email, senha, confirmarSenha);
  //
  if (item == true) {
    //
    (await this.cronapi.client('cronapi.screen.post').run("colaborador"));
    //
    this.cronapi.screen.notify('success','Cadastrado Colaborador com sucesso!');
    //
    this.cronapi.screen.changeView("#/home/logged/colaboradores",[  ]);
  }
  //
  this.cronapi.screen.notify('error','Campo Obrigatório');
}
