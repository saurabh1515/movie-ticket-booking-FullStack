import React, { Component } from 'react'

class HeaderComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                 
        }
    }
    
    render() {
        return (
            <div  style={{marginBottom: "100px"}}>
                <header>
                    {/* <nav className="navbar navbar-expand-md navbar-dark bg-dark">
                        <div><a href="/" className="navbar-brand">Movie Ticket Booking</a></div>
                    </nav> */}
                    <nav className="header-nav01">
                        <div className="logo-nav01">Movie Ticket Booking</div>
                        {/* <input type="checkbox" id="click-nav01"> */}
                        <label htmlFor="click-nav01" className="menu-btn-nav01">
                            <i className="fas fa-bars"></i>
                        </label>
                        <ul>
                            <li><a href="/">Home</a></li>
                            <li><a href="/customers">Customers</a></li>
                            <li><a href="/movies">Movies</a></li>
                            {/* <li><a href="#">Blog</a></li> */}
                        </ul>
                    </nav>
                </header>
            </div>
        )
    }
}

export default HeaderComponent
