import React from 'react';
import GoogleMapReact from 'google-map-react';

import { Icon } from '@iconify/react'
import locationIcon from '@iconify/icons-mdi/map-marker'

function MapTest(props) {
    const LocationPin = ({ text }) => (
        <div className="pin">
            <Icon icon={locationIcon} className="pin-icon" />
            <p className="pin-text">{text}</p>
        </div>
    )
    const Map = () => (
        <div className="map">
            <div className="google-map">
                <GoogleMapReact
                    bootstrapURLKeys={{ key: 'AIzaSyCuRF4LgMZwrZUQZvNZr3jBNy0g0V1kFlw' }}
                    defaultCenter={{lat: -21.4633797, lng: 47.1039884}}
                    defaultZoom={16}
                >
                    <LocationPin
                        lat={-21.4633797}
                        lng={47.1039884}
                        text={"EMIT"}
                    />
                </GoogleMapReact>
            </div>
        </div>
    )
    return (
        <div className={"maptest"}>
            <Map/>
        </div>
    );
}

export default MapTest;