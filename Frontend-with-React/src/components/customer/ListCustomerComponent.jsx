import React, { Component } from 'react'
import CustomerService from '../../services/CustomerService';

class ListCustomerComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
                customers: []
        }
        this.addCustomer = this.addCustomer.bind(this);
        this.editCustomer = this.editCustomer.bind(this);
        this.deleteCustomer = this.deleteCustomer.bind(this);
    }

    deleteCustomer(id){
        CustomerService.deleteCustomer(id).then( res => {
            this.setState({customers: this.state.customers.filter(customer => customer.customerId !== id)});
        });
    }
    viewCustomer(id){
        this.props.history.push(`/view-customer/${id}`);
    }
    editCustomer(id){
        this.props.history.push(`/add-customer/${id}`);
    }

    componentDidMount(){
        CustomerService.getCustomers().then((res) => {
            this.setState({ customers: res.data});
        });
    }

    addCustomer(){
        this.props.history.push('/add-customer/_add');
    }

    render() {
        return (
            <div className="container" style={{marginBottom: "100px"}}>
                 <h2 className="text-center">Customer List</h2>
                 <div className = "row">
                    <button style={{width: "20%"}} className="btn btn-primary" onClick={this.addCustomer}> Add Customer</button>
                 </div>
                 <br></br>
                 <div className = "row">  
                    {
                                    
                        this.state.customers.map(
                            customer => 
                            <div key = {customer.customerId} className="card" style={{width: "18rem",margin:"20px  20px"}}>
                                
                                <div className="card-body">
                                    <h4 className="card-title">{customer.customerName}</h4>
                                    <p class="card-text">{customer.email}</p>
                                    <p class="card-text">{customer.mobileNumber}</p>
                                    <button onClick={ () => this.editCustomer(customer.customerId)} className="btn btn-success">Update </button>
                                    <button style={{marginLeft: "10px"}} onClick={ () => this.deleteCustomer(customer.customerId)} className="btn btn-danger">Delete </button>
                                    <button style={{marginLeft: "10px"}} onClick={ () => this.viewCustomer(customer.customerId)} className="btn btn-info">View </button>
                                </div>
                                
                            </div>
                        )
                    }
                                
                 </div>

            </div>
        )
    }
}

export default ListCustomerComponent
