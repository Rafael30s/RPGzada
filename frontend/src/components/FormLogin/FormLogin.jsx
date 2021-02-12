import React from 'react';
import TextField from '@material-ui/core/TextField';
import { Button } from '@material-ui/core';
import "./style.css";

function FormLogin() {
  
    return (
        <form>
            <fieldset>
                <legend>Entrar</legend>
                <TextField id="email" label="Email" variant="filled" fullWidth margin="normal" />
                <TextField id="senha" label="Senha" type="password" variant="filled" fullWidth margin="normal" />

                <div>
                    <span className="convite">Ainda não possui cadastro? </span>
                    <Button variant="contained" color="primary" type="submit">
                        Cadastrar
            </Button >
                </div>


            </fieldset>
        </form>

    );
}

export default FormLogin;