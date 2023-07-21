import React from "react";
import { Link } from "react-router-dom";
import {
Card,
CardHeader,
CardBody,
CardFooter,
Input,
Checkbox,
Button,
Typography,
Select,
Option
} from "@material-tailwind/react";
import { SimpleFooter } from "@/widgets/layout";
export function Donate_Monthly() {
    return (
    <>
        <img
        src="/img/background-2.jpg"
        className="absolute inset-0 z-0 h-full w-full object-cover"
        />
        <div className="absolute inset-0 z-0 h-full w-full bg-black/50" />
        <div className="container mx-auto p-4">
        <Card className="absolute top-2/4 left-2/4 w-full max-w-[24rem] -translate-y-2/4 -translate-x-2/4">
            <CardHeader
            variant="gradient"
            color="blue"
            className="mb-4 grid h-28 place-items-center"
            >
            <Typography variant="h3" color="white">
                DONATE MONTHLY
            </Typography>
            </CardHeader>
            <CardBody className="flex flex-col gap-4">
            <Input variant="standard" type="text" label="Name" size="lg" />
            <Input variant="standard" type="text" label="Phone Number" size="lg" />
            <Input variant="standard" type="text" label="Money Donate" size="lg" />
            <Select variant="standard" label="Select Month" size="lg">
                <Option>1</Option>
                <Option>2</Option>
                <Option>3</Option>
                <Option>4</Option>
                <Option>5</Option>
                <Option>6</Option>
                <Option>7</Option>
                <Option>8</Option>
                <Option>9</Option>
                <Option>10</Option>
                <Option>11</Option>
                <Option>12</Option>
            </Select>
            </CardBody>
            <CardFooter className="pt-0">
            <Button variant="gradient" fullWidth>
                DONATE FOR US
            </Button>
            </CardFooter>
        </Card>
        </div>
        <div className="container absolute bottom-6 left-2/4 z-10 mx-auto -translate-x-2/4 text-white">
        <SimpleFooter />
        </div>
    </>
    );
}
export default Donate_Monthly;