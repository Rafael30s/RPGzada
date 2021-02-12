import React, { Component } from "react";
import "./style.css";

class Header extends Component {
    // apagar() {
    //     const indice = this.props.indice;
    //     this.props.apagarNota(indice);
    // }

    render() {
        return (
            <section>
                <header>
                    <nav>
                        <a href="#">Home</a>
                        <a href="#">Cadastro</a>
                        <a href="#">Sobre</a>
                    </nav>
                </header>

            </section>
        );
    }
}

export default Header;