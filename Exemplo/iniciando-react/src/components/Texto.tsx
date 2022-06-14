
type TweetProps = {
    text: string;
}

export function Texto(props: TweetProps){
    return(
       <p>{props.text}</p>
    );
}