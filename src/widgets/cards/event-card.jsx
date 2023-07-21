import { Card, Avatar, Typography } from "@material-tailwind/react";
import PropTypes from "prop-types";
export function EventCard({arcticle_id, event_id, event_title, event_description, start_date, end_date, img}) {
    return(
        
        <Card color="transparent" shadow={false} className="text-center">
            <Typography>{arcticle_id}, {event_id}, {event_title}, {event_description}, {start_date}, {end_date}
            </Typography>
            <Avatar
                src={img}
                alt={event_title}
                size="xxl"
                className="h-full w-full shadow-lg shadow-gray-500/25"
            />
        </Card>
    );
}
EventCard.PropTypes={
    arcticle_id: PropTypes.int.isRequired,
    event_id: PropTypes.int.isRequired,
    event_title: PropTypes.string.isRequired,
    event_description: PropTypes.string.isRequired,
    img: PropTypes.string.isRequired,
    start_date: PropTypes.string.isRequired,
    end_date: PropTypes.string.isRequired,
};

EventCard.displayName = "/src/widgets/layout/event-card.jsx";
export default EventCard;