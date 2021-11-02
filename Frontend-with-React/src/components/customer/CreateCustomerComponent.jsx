import React, { Component } from 'react'
import CustomerService from '../../services/CustomerService';

class CreateCustomerComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id,
            customerName: '',
            address : '',
            mobileNumber : '',
            email: '',
            password : ''
        }

        this.changeCustomerNameHandler = this.changeCustomerNameHandler.bind(this);
        this.changeAddressHandler = this.changeAddressHandler.bind(this);
        this.changeMobileNumberHandler = this.changeMobileNumberHandler.bind(this);
        this.changeEmailIdHandler = this.changeEmailIdHandler.bind(this);
        this.changePasswordHandler = this.changePasswordHandler.bind(this);
        this.saveOrUpdateCustomer = this.saveOrUpdateCustomer.bind(this);
    }

    // step 3
    componentDidMount(){

        // step 4
        if(this.state.id === '_add'){
            return
        }else{
            CustomerService.getCustomerById(this.state.id).then( (res) =>{
                let customer = res.data;
                this.setState({customerName: customer.customerName,
                    address : customer.address,
                    mobileNumber : customer.mobileNumber,
                    email : customer.email,
                    password : customer.password
                });
            });
        }        
    }
    saveOrUpdateCustomer = (e) => {
        e.preventDefault();
        let customer = {customerName: this.state.customerName, address: this.state.address, mobileNumber: this.state.mobileNumber, email: this.state.email, password: this.state.password,};
        console.log('customer => ' + JSON.stringify(customer));

        // step 5
        if(this.state.id === '_add'){
            CustomerService.createCustomer(customer).then(res =>{
                this.props.history.push('/customers');
            });
        }else{
            customer.customerId = this.state.id;
            console.log('customer => ' + JSON.stringify(customer));
            CustomerService.updateCustomer(customer).then( res => {
                this.props.history.push('/customers');
            });
        }
    }
    
    changeCustomerNameHandler= (event) => {
        this.setState({customerName: event.target.value});
    }

    changeAddressHandler= (event) => {
        this.setState({address: event.target.value});
    }

    changeMobileNumberHandler= (event) => {
        this.setState({mobileNumber: event.target.value});
    }

    changeEmailIdHandler= (event) => {
        this.setState({email: event.target.value});
    }

    changePasswordHandler= (event) => {
        this.setState({password: event.target.value});
    }

    cancel() {
        this.props.history.push('/customers');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add Customer</h3>
        }else{
            return <h3 className="text-center">Update Customer</h3>
        }
    }
    render() {
        return (
            <div >
            
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            {/* <label> Customer Name: </label> */}
                                            <input placeholder="Customer Name" name="customerName" className="form-control" 
                                                value={this.state.customerName} onChange={this.changeCustomerNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            {/* <label> Address: </label> */}
                                            <input placeholder="Address" name="address" className="form-control" 
                                                value={this.state.address} onChange={this.changeAddressHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            {/* <label> Mobile Number: </label> */}
                                            <input placeholder="MobileNumber" name="mobileNumber" className="form-control" 
                                                value={this.state.mobileNumber} onChange={this.changeMobileNumberHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            {/* <label> Email Id: </label> */}
                                            <input placeholder="Email Address" name="emailId" className="form-control" 
                                                value={this.state.email} onChange={this.changeEmailIdHandler}/>
                                        </div>
                                        
                                        <div className = "form-group">
                                            {/* <label> Password: </label> */}
                                            <input type="password" placeholder="Password" name="password" className="form-control" 
                                                value={this.state.password} onChange={this.changePasswordHandler}/>
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdateCustomer}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        )
    }
}

export default CreateCustomerComponent
