import React from 'react';
//import GoogleMapReact from 'google-map-react';

/* MUI */
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';

/* assets */
import house from './assets/images/real-estate-6688945_960_720.jpg'
function MoreInfo(props) {
    return (
        <div className={"more-info"}>
            <div className="info-reservation">
                <Card className={"card-reservation"} style={{ background: `url(${house})`, backgroundSize: 'cover', backgroundPosition: 'center', backgroundRepeat: 'no-repeat'}}>
                    <CardContent>
                        <h1>Lorem ipsum dolor sit amet.</h1>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab accusamus ad autem corporis deleniti eaque esse iure maxime nam obcaecati officiis omnis quia recusandae rem, reprehenderit, sequi similique tempore tenetur veritatis voluptatum! Amet blanditiis delectus enim eum id illo magnam reprehenderit repudiandae! Esse ex nisi reiciendis rem tempore! Iure, ullam.</p>
                    </CardContent>
                    <CardActions>
                        <Button variant="contained" size="medium" className={"Button"}>Reserver</Button>
                    </CardActions>
                </Card>
            </div>

            <div className="info-content">
                <Card className={"card-map"}>
                    <CardContent>
                        <Typography variant="h5" component="div">
                            {/*<GoogleMapReact
                                bootstrapURLKeys={{ key: 'AIzaSyCuRF4LgMZwrZUQZvNZr3jBNy0g0V1kFlw' }}
                                defaultCenter={{ lat: 48.8566, lng: 2.3522 }}
                                defaultZoom={11}
                                >
                            </GoogleMapReact>*/}
                            MAP
                        </Typography>
                    </CardContent>
                </Card>
            </div>
        </div>
    );
}

export default MoreInfo;