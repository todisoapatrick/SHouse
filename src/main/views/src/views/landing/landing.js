import React from 'react';
import { useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";

/* MUI */
import Button from '@mui/material/Button';
import CreateIcon from '@mui/icons-material/Create';
import LoginIcon from '@mui/icons-material/Login';
import RoofingRoundedIcon from '@mui/icons-material/RoofingRounded';
import SearchIcon from '@mui/icons-material/Search';
import RocketLaunchIcon from '@mui/icons-material/RocketLaunch';
import Paper from '@mui/material/Paper';
import InputBase from '@mui/material/InputBase';
import Divider from '@mui/material/Divider';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import DirectionsIcon from '@mui/icons-material/Directions';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Typography from '@mui/material/Typography';

/* assets */
import searchHouse from './assets/images/House searching-amico.png'
import houseImg from './assets/images/real-estate-6688945_960_720.jpg';


function Landing(props) {
    const navigate = useNavigate();

    return (
        <div className={"landing"}>

            <div className={"navbar"}>
                <div className={"logo"}>
                    <p className={"logo-content"}>
                        <RoofingRoundedIcon className={"logo-house"}/>
                         S
                        <span className={"logo-part"}>House</span>
                    </p>
                </div>

                <div className={"authentication"}>
                    <Button variant="contained" startIcon={<CreateIcon />} onClick={() => {navigate("/auth/signin");}} disableElevation>S'Inscrire</Button>
                    <Button variant="outlined" startIcon={<LoginIcon />} onClick={() => {navigate("/auth/login");}} disableElevation>Se connecter</Button>
                    <Button variant="text" onClick={() => {navigate("#");}} disableElevation>Contactez-nous</Button>
                </div>
            </div>

            <div className="landing-header">
                <img src={searchHouse} alt={"Search_house"} className={"search_house"}/>
                <div className="header_text">
                    <h1 className="header_title">
                        <span className="title_colored">Bienvenue sur</span> SHouse
                    </h1>
                    <p className="header_content">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Atque eos ipsa perferendis porro! Blanditiis culpa deserunt ducimus harum laborum magni, placeat reiciendis sapiente sit vitae. Ab dolorum eos ipsa laudantium molestiae odit quaerat vero. Accusantium eius ipsam sequi totam voluptatum. Animi consequatur cum eaque ipsam libero, placeat porro similique! Minima?</p>
                    <Button variant="contained" onClick={() => {navigate("/#search_colored");}} size="large" endIcon={<RocketLaunchIcon/>} disableElevation>Commencer</Button>
                </div>
            </div>

            <div className="landing-search">
                <h1 className="search_title" id={"search_title"}>
                    Trouvez la maison<span className="search_colored"> de votre rêve</span>
                </h1>
                <div className="search_bar">
                    <Paper
                        component="form"
                        sx={{ p: '2px 4px', display: 'flex', alignItems: 'center', width: 400 }}
                    >
                        <IconButton sx={{ p: '10px' }} aria-label="menu">
                            <MenuIcon />
                        </IconButton>
                        <InputBase
                            sx={{ ml: 1, flex: 1 }}
                            placeholder="Entrez la ville..."
                            inputProps={{ 'aria-label': 'Entrez la ville...' }}
                        />
                        <IconButton type="button" sx={{ p: '10px' }} aria-label="search">
                            <SearchIcon />
                        </IconButton>
                        <Divider sx={{ height: 28, m: 0.5 }} orientation="vertical" />
                        <IconButton color="primary" sx={{ p: '10px' }} aria-label="directions">
                            <DirectionsIcon />
                        </IconButton>
                    </Paper>
                </div>

                <div className="container search_result">
                    <div className="result_cards">
                        <Card sx={{ maxWidth: 345 }}>
                            <CardMedia
                                sx={{ height: 140 }}
                                image={houseImg}
                                title="house"
                            />
                            <CardContent>
                                <Typography gutterBottom variant="h5" component="div">
                                    Maison
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Ville: Fianarantsoa <br/>
                                    Localisation: Lorem ipsum dolor sit amet <br/>
                                    Chambres: 5 <br/>
                                    Électricité: oui <br/>
                                    Eau: oui
                                </Typography>
                            </CardContent>
                            <CardActions>
                                <Button size="small" onClick={() => {navigate("/app/more-info");}}>En savoir plus</Button>
                            </CardActions>
                        </Card>
                    </div>

                    <div className="result_cards">
                        <Card sx={{ maxWidth: 345 }}>
                            <CardMedia
                                sx={{ height: 140 }}
                                image={houseImg}
                                title="house"
                            />
                            <CardContent>
                                <Typography gutterBottom variant="h5" component="div">
                                    Maison
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Ville: Fianarantsoa <br/>
                                    Localisation: Lorem ipsum dolor sit amet <br/>
                                    Chambres: 5 <br/>
                                    Électricité: oui <br/>
                                    Eau: oui
                                </Typography>
                            </CardContent>
                            <CardActions>
                                <Button size="small" onClick={() => {navigate("/app/more-info");}}>En savoir plus</Button>
                            </CardActions>
                        </Card>
                    </div>

                    <div className="result_cards">
                        <Card sx={{ maxWidth: 345 }}>
                            <CardMedia
                                sx={{ height: 140 }}
                                image={houseImg}
                                title="house"
                            />
                            <CardContent>
                                <Typography gutterBottom variant="h5" component="div">
                                    Maison
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Ville: Fianarantsoa <br/>
                                    Localisation: Lorem ipsum dolor sit amet <br/>
                                    Chambres: 5 <br/>
                                    Électricité: oui <br/>
                                    Eau: oui
                                </Typography>
                            </CardContent>
                            <CardActions>
                                <Button size="small" onClick={() => {navigate("/app/more-info");}}>En savoir plus</Button>
                            </CardActions>
                        </Card>
                    </div>

                    <div className="result_cards">
                        <Card sx={{ maxWidth: 345 }}>
                            <CardMedia
                                sx={{ height: 140 }}
                                image={houseImg}
                                title="house"
                            />
                            <CardContent>
                                <Typography gutterBottom variant="h5" component="div">
                                    Maison
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Ville: Fianarantsoa <br/>
                                    Localisation: Lorem ipsum dolor sit amet <br/>
                                    Chambres: 5 <br/>
                                    Électricité: oui <br/>
                                    Eau: oui
                                </Typography>
                            </CardContent>
                            <CardActions>
                                <Button size="small" onClick={() => {navigate("/app/more-info");}}>En savoir plus</Button>
                            </CardActions>
                        </Card>
                    </div>

                    <div className="result_cards">
                        <Card sx={{ maxWidth: 345 }}>
                            <CardMedia
                                sx={{ height: 140 }}
                                image={houseImg}
                                title="house"
                            />
                            <CardContent>
                                <Typography gutterBottom variant="h5" component="div">
                                    Maison
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Ville: Fianarantsoa <br/>
                                    Localisation: Lorem ipsum dolor sit amet <br/>
                                    Chambres: 5 <br/>
                                    Électricité: oui <br/>
                                    Eau: oui
                                </Typography>
                            </CardContent>
                            <CardActions>
                                <Button size="small" onClick={() => {navigate("/app/more-info");}}>En savoir plus</Button>
                            </CardActions>
                        </Card>
                    </div>

                    <div className="result_cards">
                        <Card sx={{ maxWidth: 345 }}>
                            <CardMedia
                                sx={{ height: 140 }}
                                image={houseImg}
                                title="house"
                            />
                            <CardContent>
                                <Typography gutterBottom variant="h5" component="div">
                                    Maison
                                </Typography>
                                <Typography variant="body2" color="text.secondary">
                                    Ville: Fianarantsoa <br/>
                                    Localisation: Lorem ipsum dolor sit amet <br/>
                                    Chambres: 5 <br/>
                                    Électricité: oui <br/>
                                    Eau: oui
                                </Typography>
                            </CardContent>
                            <CardActions>
                                <Button size="small" onClick={() => {navigate("/app/more-info");}}>En savoir plus</Button>
                            </CardActions>
                        </Card>
                    </div>
                </div>
            </div>
            <div className="landing-footer">
                <h2 className="footer_title">
                    A propos de nous:
                </h2>
                <p className="footer_content">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda beatae consequatur doloremque eius et ex, iure minus officia quae quam. Alias enim laborum non, possimus quam quis ullam! Culpa cum cupiditate dolorum eligendi eos facere minima molestias non recusandae ullam! Blanditiis delectus ea facere illo ipsam repellat reprehenderit suscipit tempore!<br/><br/>
                <Link to={"https://storyset.com/online"}>Online illustrations by Storyset</Link>
                </p>
                <p className="footer_copyright">Devellopeur: Mamilalaina Todisoa Gabrielo Patrick<br/> <br/>
                    Copyright 2023
                </p>
            </div>
        </div>
    );
}

export default Landing;