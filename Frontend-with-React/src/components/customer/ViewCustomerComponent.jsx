import React, { Component } from 'react'
import CustomerService from '../../services/CustomerService';

class ViewCustomerComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            customer: {}
        }
    }

    componentDidMount(){
        CustomerService.getCustomerById(this.state.id).then( res => {
            this.setState({customer: res.data});
        })
    }

    cancel() {
        this.props.history.push('/customers');
    }

    render() {
        return (
            <div className="container">
                <h3 className = "text-center">  Customer Details</h3>
                <table class="table table-borderless">
                    <thead>
                        <tr>
                        <th scope="col"></th>
                        <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <th scope="row">Customer Name:</th>
                            <td>{ this.state.customer.customerName }</td>
                           
                        </tr>
                        <tr>
                            <th scope="row">Customer Address: </th>
                            <td> { this.state.customer.address }</td>
                           
                        </tr>
                        <tr>
                            <th scope="row">Customer Mobile Number:</th>
                            <td>{ this.state.customer.mobileNumber }</td>
                           
                        </tr>
                        <tr>
                            <th scope="row">Customer Email Id:</th>
                            <td>{ this.state.customer.email }</td>
                           
                        </tr>
                        <tr>
                            <th scope="row">Customer Password:</th>
                            <td>{ this.state.customer.password }</td>
                           
                        </tr>
                        
                    </tbody>
                </table>
                <button  className="btn btn-danger" onClick={this.cancel.bind(this)} style={{margin: "50px 200px"}}>Back</button>
            </div>
        )
    }
}

export default ViewCustomerComponent
